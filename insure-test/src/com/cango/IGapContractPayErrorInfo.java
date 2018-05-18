package	com.cango;
public class IGapContractPayErrorInfo {
	private int errorid;
	private String contractno;
	private String paraminfo;
	public void setErrorid(int errorid){
		this.errorid = errorid;
	}
	public int getErrorid(){
		return errorid;
	}
	public void setContractno(String contractno){
		this.contractno = contractno;
	}
	public String getContractno(){
		return contractno;
	}
	public void setParaminfo(String paraminfo){
		this.paraminfo = paraminfo;
	}
	public String getParaminfo(){
		return paraminfo;
	}
}
