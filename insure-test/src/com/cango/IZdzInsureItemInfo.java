package	com.cango;
public class IZdzInsureItemInfo {
	private String insureNo;
	private String insureItem;
	private double insureItemAmount;
	private double insureItemPremium;
	private Date createDateTime;
	private int createUser;
	private Date lastUpdateTime;
	private int updateUser;
	public void setInsureNo(String insureNo){
		this.insureNo = insureNo;
	}
	public String getInsureNo(){
		return insureNo;
	}
	public void setInsureItem(String insureItem){
		this.insureItem = insureItem;
	}
	public String getInsureItem(){
		return insureItem;
	}
	public void setInsureItemAmount(double insureItemAmount){
		this.insureItemAmount = insureItemAmount;
	}
	public double getInsureItemAmount(){
		return insureItemAmount;
	}
	public void setInsureItemPremium(double insureItemPremium){
		this.insureItemPremium = insureItemPremium;
	}
	public double getInsureItemPremium(){
		return insureItemPremium;
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
