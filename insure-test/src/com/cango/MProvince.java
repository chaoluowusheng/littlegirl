package	com.cango;
public class MProvince {
	private short provinceCd;
	private String provinceName;
	private String provinceNickName;
	private Date createDateTime;
	private short createUser;
	private Date lastUpdateTime;
	private short updateUser;
	public void setProvinceCd(short provinceCd){
		this.provinceCd = provinceCd;
	}
	public short getProvinceCd(){
		return provinceCd;
	}
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	public String getProvinceName(){
		return provinceName;
	}
	public void setProvinceNickName(String provinceNickName){
		this.provinceNickName = provinceNickName;
	}
	public String getProvinceNickName(){
		return provinceNickName;
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
