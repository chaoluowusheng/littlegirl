package	com.cango;
public class MCityMapping {
	private int cityId;
	private String lingxiCityCd;
	private Date createDateTime;
	private short createUser;
	private Date lastUpdateTime;
	private short updateUser;
	public void setCityId(int cityId){
		this.cityId = cityId;
	}
	public int getCityId(){
		return cityId;
	}
	public void setLingxiCityCd(String lingxiCityCd){
		this.lingxiCityCd = lingxiCityCd;
	}
	public String getLingxiCityCd(){
		return lingxiCityCd;
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
