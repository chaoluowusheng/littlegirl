package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * �������ݿ��ṹ �Զ�����java Bean
 * 
 * @author DLHT 2016��3��4������5:00:28 AutoCreateClass.java DLHT
 */
public class AutoCreateBean {

	// mysql ������
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	// ���ݿ��¼�û���
	private static final String USER = "root";

	// ���ݿ��¼����
	private static final String PASSWORD = "cango";

	// ���ݿ����ӵ�ַ
	private static final String URL = "jdbc:mysql://192.168.121.155:3306/insurance_platform";

	private static String tablename;

	private String[] colnames; // ��������

	private String[] colTypes; // ������������

	private int[] colSizes; // ������С����

	private boolean f_util = false; // �Ƿ���Ҫ�����java.util.*

	private boolean f_sql = false; // �Ƿ���Ҫ�����java.sql.*

	public static void main(String[] args) throws Exception {
		AutoCreateBean auto = new AutoCreateBean();
		List<String> list = auto.TBlist();
		auto.GenEntity(list, "com/cango");
		System.out.print("hello world !");
	}

	/**
	 * ��ȡָ�����ݿ��а����ı� TBlist
	 * 
	 * @time 2016��3��4������5:54:52
	 * @packageName com.util
	 * @return �������б���(�������ŵ�һ��������)
	 * @throws Exception
	 */
	public List<String> TBlist() throws Exception {
		// �������ݿ� ���� JDBC��ʽ
		Class.forName(DRIVER);

		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

		DatabaseMetaData md = con.getMetaData();

		List<String> list = null;

		ResultSet rs = md.getTables(null, null, "", null);
		if (rs != null) {
			list = new ArrayList<String>();
		}
		while (rs.next()) {
			// System.out.println("|��" + (i++) + ":" + rs.getString("TABLE_NAME"));
			String tableName = rs.getString("TABLE_NAME");
			list.add(tableName);
		}
		rs = null;
		md = null;
		con = null;
		return list;
	}

	private String converName(String str) {
		
		int index = str.indexOf("_");
		if (index > 0) {
			String start = str.substring(0, index);
			String c = str.substring(index + 1, index + 2);
			String end = str.substring(index + 2);
			str = start + c.toUpperCase() + end;
			
			return converName(str);
		}
		
		return str;
	}
	
	public void GenEntity(List<String> TBlist, String packageName) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSetMetaData rsmd = null;

		// �������ݿ� ���� JDBC��ʽ
		Class.forName(DRIVER);
		conn = DriverManager.getConnection(URL, USER, PASSWORD);

		for (int k = 0; k < TBlist.size(); k++) {
			tablename = TBlist.get(k);
			String strsql = "select * from " + tablename;
			pstmt = conn.prepareStatement(strsql);
			rsmd = pstmt.getMetaData();
			int size = rsmd.getColumnCount();
			// ���ж�����
			colnames = new String[size];
			colTypes = new String[size];
			colSizes = new int[size];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				colnames[i] = rsmd.getColumnName(i + 1).toLowerCase();
				colTypes[i] = rsmd.getColumnTypeName(i + 1);
				if (colTypes[i].equalsIgnoreCase("datetime")) {
					f_util = true;
				}
				if (colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text")) {
					f_sql = true;
				}
				colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
			}
			markerBean(converName(initcap(tablename)), parse(), packageName);
		}
		pstmt = null;
		rsmd = null;
		conn = null;
	}

	/**
	 * ��������(����ʵ�����������)
	 */
	private String parse() {
		StringBuffer sb = new StringBuffer();
		if (f_util) {
			sb.append("import java.util.Date;\r\n");
		}
		if (f_sql) {
			sb.append("import java.sql.*;\r\n\r\n\r\n");
		}
		sb.append("public class " + converName(initcap(tablename)) + " {\r\n");
		processAllAttrs(sb);
		processAllMethod(sb);
		sb.append("}\r\n");

		return sb.toString();

	}

	/**
	 * ����java �ļ� �����ɵ����� get/set ���� ���浽 �ļ��� markerBean
	 * 
	 * @time 2015��9��29������4:15:22
	 * @packageName fanshe
	 * @param className
	 *            ������
	 * @param content
	 *            ������ �������� getset ����
	 */
	public void markerBean(String className, String content, String packageName) {
		String folder = System.getProperty("user.dir") + "/src/" + packageName + "/";

		File file = new File(folder);
		if (!file.exists()) {
			file.mkdirs();
		}
		String fileName = folder + className + ".java";

		try {
			File newdao = new File(fileName);
			FileWriter fw = new FileWriter(newdao);
			fw.write("package\t" + packageName.replace("/", ".") + ";\r\n");
			fw.write(content);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �������еķ���
	 * 
	 * @param sb
	 */
	private void processAllMethod(StringBuffer sb) {
		for (int i = 0; i < colnames.length; i++) {
			sb.append("\tpublic void set" + initcap(converName(colnames[i])) + "(" + sqlType2JavaType(colTypes[i]) + " "
					+ converName(colnames[i]) + "){\r\n");
			sb.append("\t\tthis." + converName(colnames[i]) + " = " + converName(colnames[i]) + ";\r\n");
			sb.append("\t}\r\n");

			sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initcap(converName(colnames[i])) + "(){\r\n");
			sb.append("\t\treturn " + converName(colnames[i]) + ";\r\n");
			sb.append("\t}\r\n");
		}
	}

	/**
	 * �����������
	 * 
	 * @return
	 */
	private void processAllAttrs(StringBuffer sb) {
		for (int i = 0; i < colnames.length; i++) {
			sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + converName(colnames[i]) + ";\r\n");

		}
	}

	/**
	 * �������ַ���������ĸ�ĳɴ�д
	 * 
	 * @param str
	 * @return
	 */
	private String initcap(String str) {
		char[] ch = str.toCharArray();
		if (ch[0] >= 'a' && ch[0] <= 'z') {
			ch[0] = (char) (ch[0] - 32);
		}
		return new String(ch);
	}

	private String sqlType2JavaType(String sqlType) {
		if (sqlType.equalsIgnoreCase("bit")) {
			return "bool";
		} else if (sqlType.equalsIgnoreCase("tinyint")) {
			return "byte";
		} else if (sqlType.equalsIgnoreCase("smallint")) {
			return "short";
		} else if (sqlType.equalsIgnoreCase("int")) {
			return "int";
		} else if (sqlType.equalsIgnoreCase("bigint")) {
			return "long";
		} else if (sqlType.equalsIgnoreCase("float")) {
			return "float";
		} else if (sqlType.equalsIgnoreCase("decimal") || sqlType.equalsIgnoreCase("numeric")
				|| sqlType.equalsIgnoreCase("real")) {
			return "double";
		} else if (sqlType.equalsIgnoreCase("money") || sqlType.equalsIgnoreCase("smallmoney")) {
			return "double";
		} else if (sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char")
				|| sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar")) {
			return "String";
		} else if (sqlType.equalsIgnoreCase("datetime") || sqlType.equalsIgnoreCase("timestamp") || sqlType.equalsIgnoreCase("date")) {
			return "Date";
		}

		else if (sqlType.equalsIgnoreCase("image")) {
			return "Blob";
		} else if (sqlType.equalsIgnoreCase("text")) {
			return "Clob";
		}
		return null;
	}

}
