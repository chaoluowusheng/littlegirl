package	com.cango;
public class MAuth {
	private int id;
	private String applyid;
	private String appsecret;
	private Date createtime;
	private byte usingflg;
	private String token;
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setApplyid(String applyid){
		this.applyid = applyid;
	}
	public String getApplyid(){
		return applyid;
	}
	public void setAppsecret(String appsecret){
		this.appsecret = appsecret;
	}
	public String getAppsecret(){
		return appsecret;
	}
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
	public Date getCreatetime(){
		return createtime;
	}
	public void setUsingflg(byte usingflg){
		this.usingflg = usingflg;
	}
	public byte getUsingflg(){
		return usingflg;
	}
	public void setToken(String token){
		this.token = token;
	}
	public String getToken(){
		return token;
	}
}
