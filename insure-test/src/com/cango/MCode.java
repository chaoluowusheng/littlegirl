package	com.cango;
public class MCode {
	private short classcd;
	private String classname;
	private short itemcd;
	private byte itemvalue;
	private String itemcontent;
	private String iteminfo;
	public void setClasscd(short classcd){
		this.classcd = classcd;
	}
	public short getClasscd(){
		return classcd;
	}
	public void setClassname(String classname){
		this.classname = classname;
	}
	public String getClassname(){
		return classname;
	}
	public void setItemcd(short itemcd){
		this.itemcd = itemcd;
	}
	public short getItemcd(){
		return itemcd;
	}
	public void setItemvalue(byte itemvalue){
		this.itemvalue = itemvalue;
	}
	public byte getItemvalue(){
		return itemvalue;
	}
	public void setItemcontent(String itemcontent){
		this.itemcontent = itemcontent;
	}
	public String getItemcontent(){
		return itemcontent;
	}
	public void setIteminfo(String iteminfo){
		this.iteminfo = iteminfo;
	}
	public String getIteminfo(){
		return iteminfo;
	}
}
