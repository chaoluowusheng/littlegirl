package	com.cango;
public class MLingxiArea {
	private String lingxiAreaCd;
	private String lingxiAreaName;
	private Date createDateTime;
	private short createUser;
	private Date lastUpdateTime;
	private short updateUser;
	public void setLingxiAreaCd(String lingxiAreaCd){
		this.lingxiAreaCd = lingxiAreaCd;
	}
	public String getLingxiAreaCd(){
		return lingxiAreaCd;
	}
	public void setLingxiAreaName(String lingxiAreaName){
		this.lingxiAreaName = lingxiAreaName;
	}
	public String getLingxiAreaName(){
		return lingxiAreaName;
	}
	public void setCreateDateTime(Date createDateTime){
		this.createDateTime = createDateTime;
	}
	public Date getCreateDateTime(){
		return createDateTime;
	}
	public void setCreateUser(short createUser){
		this.createUser = createUser;
	}
	public short getCreateUser(){
		return createUser;
	}
	public void setLastUpdateTime(Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getLastUpdateTime(){
		return lastUpdateTime;
	}
	public void setUpdateUser(short updateUser){
		this.updateUser = updateUser;
	}
	public short getUpdateUser(){
		return updateUser;
	}
}
