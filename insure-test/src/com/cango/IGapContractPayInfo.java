package	com.cango;
public class IGapContractPayInfo {
	private int payid;
	private String contractno;
	private String txcode;
	private String paymentno;
	private String status;
	private int payamount;
	private Date paytime;
	private Date createdatetime;
	private int createuser;
	private Date lastupdatetime;
	private int updateuser;
	public void setPayid(int payid){
		this.payid = payid;
	}
	public int getPayid(){
		return payid;
	}
	public void setContractno(String contractno){
		this.contractno = contractno;
	}
	public String getContractno(){
		return contractno;
	}
	public void setTxcode(String txcode){
		this.txcode = txcode;
	}
	public String getTxcode(){
		return txcode;
	}
	public void setPaymentno(String paymentno){
		this.paymentno = paymentno;
	}
	public String getPaymentno(){
		return paymentno;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return status;
	}
	public void setPayamount(int payamount){
		this.payamount = payamount;
	}
	public int getPayamount(){
		return payamount;
	}
	public void setPaytime(Date paytime){
		this.paytime = paytime;
	}
	public Date getPaytime(){
		return paytime;
	}
	public void setCreatedatetime(Date createdatetime){
		this.createdatetime = createdatetime;
	}
	public Date getCreatedatetime(){
		return createdatetime;
	}
	public void setCreateuser(int createuser){
		this.createuser = createuser;
	}
	public int getCreateuser(){
		return createuser;
	}
	public void setLastupdatetime(Date lastupdatetime){
		this.lastupdatetime = lastupdatetime;
	}
	public Date getLastupdatetime(){
		return lastupdatetime;
	}
	public void setUpdateuser(int updateuser){
		this.updateuser = updateuser;
	}
	public int getUpdateuser(){
		return updateuser;
	}
}
