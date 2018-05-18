package	com.cango;
public class MToken {
	private String id;
	private String token;
	private Date createdatetime;
	private Date lastupdatetime;
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setToken(String token){
		this.token = token;
	}
	public String getToken(){
		return token;
	}
	public void setCreatedatetime(Date createdatetime){
		this.createdatetime = createdatetime;
	}
	public Date getCreatedatetime(){
		return createdatetime;
	}
	public void setLastupdatetime(Date lastupdatetime){
		this.lastupdatetime = lastupdatetime;
	}
	public Date getLastupdatetime(){
		return lastupdatetime;
	}
}
