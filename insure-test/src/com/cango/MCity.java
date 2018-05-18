package	com.cango;
public class MCity {
	private int cityId;
	private String cityCd;
	private String cityName;
	private String provinceCd;
	private short validFlg;
	private String comment;
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
	public void setCityCd(String cityCd){
		this.cityCd = cityCd;
	}
	public String getCityCd(){
		return cityCd;
	}
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	public String getCityName(){
		return cityName;
	}
	public void setProvinceCd(String provinceCd){
		this.provinceCd = provinceCd;
	}
	public String getProvinceCd(){
		return provinceCd;
	}
	public void setValidFlg(short validFlg){
		this.validFlg = validFlg;
	}
	public short getValidFlg(){
		return validFlg;
	}
	public void setComment(String comment){
		this.comment = comment;
	}
	public String getComment(){
		return comment;
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
