package	com.cango;
public class IZdzCityInsurePolicy {
	private int cityId;
	private String insureItem;
	private int defaultAmount;
	private int isNeedBuy;
	private Date createDateTime;
	private int createUser;
	private Date lastUpdateTime;
	private int updateUser;
	public void setCityId(int cityId){
		this.cityId = cityId;
	}
	public int getCityId(){
		return cityId;
	}
	public void setInsureItem(String insureItem){
		this.insureItem = insureItem;
	}
	public String getInsureItem(){
		return insureItem;
	}
	public void setDefaultAmount(int defaultAmount){
		this.defaultAmount = defaultAmount;
	}
	public int getDefaultAmount(){
		return defaultAmount;
	}
	public void setIsNeedBuy(int isNeedBuy){
		this.isNeedBuy = isNeedBuy;
	}
	public int getIsNeedBuy(){
		return isNeedBuy;
	}
	public void setCreateDateTime(Date createDateTime){
		this.createDateTime = createDateTime;
	}
	public Date getCreateDateTime(){
		return createDateTime;
	}
	public void setCreateUser(int createUser){
		this.createUser = createUser;
	}
	public int getCreateUser(){
		return createUser;
	}
	public void setLastUpdateTime(Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getLastUpdateTime(){
		return lastUpdateTime;
	}
	public void setUpdateUser(int updateUser){
		this.updateUser = updateUser;
	}
	public int getUpdateUser(){
		return updateUser;
	}
}
