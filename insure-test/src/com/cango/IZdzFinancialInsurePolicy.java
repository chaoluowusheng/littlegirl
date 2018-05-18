package	com.cango;
public class IZdzFinancialInsurePolicy {
	private int id;
	private int financialId;
	private String cooperativeFinancialCd;
	private String loanProductId;
	private String insureItem;
	private int isNeedBuy;
	private int leastAmount;
	private int isEqualCarPrice;
	private Date createDateTime;
	private String createUser;
	private Date lastUpdateTime;
	private String updateUser;
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setFinancialId(int financialId){
		this.financialId = financialId;
	}
	public int getFinancialId(){
		return financialId;
	}
	public void setCooperativeFinancialCd(String cooperativeFinancialCd){
		this.cooperativeFinancialCd = cooperativeFinancialCd;
	}
	public String getCooperativeFinancialCd(){
		return cooperativeFinancialCd;
	}
	public void setLoanProductId(String loanProductId){
		this.loanProductId = loanProductId;
	}
	public String getLoanProductId(){
		return loanProductId;
	}
	public void setInsureItem(String insureItem){
		this.insureItem = insureItem;
	}
	public String getInsureItem(){
		return insureItem;
	}
	public void setIsNeedBuy(int isNeedBuy){
		this.isNeedBuy = isNeedBuy;
	}
	public int getIsNeedBuy(){
		return isNeedBuy;
	}
	public void setLeastAmount(int leastAmount){
		this.leastAmount = leastAmount;
	}
	public int getLeastAmount(){
		return leastAmount;
	}
	public void setIsEqualCarPrice(int isEqualCarPrice){
		this.isEqualCarPrice = isEqualCarPrice;
	}
	public int getIsEqualCarPrice(){
		return isEqualCarPrice;
	}
	public void setCreateDateTime(Date createDateTime){
		this.createDateTime = createDateTime;
	}
	public Date getCreateDateTime(){
		return createDateTime;
	}
	public void setCreateUser(String createUser){
		this.createUser = createUser;
	}
	public String getCreateUser(){
		return createUser;
	}
	public void setLastUpdateTime(Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getLastUpdateTime(){
		return lastUpdateTime;
	}
	public void setUpdateUser(String updateUser){
		this.updateUser = updateUser;
	}
	public String getUpdateUser(){
		return updateUser;
	}
}
