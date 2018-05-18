package	com.cango;
public class IZdzCustomTrafficCommisionPolicyHis {
	private int applyId;
	private int dealerId;
	private int insureCompanyId;
	private Date startDate;
	private Date endDate;
	private double commision;
	private int status;
	private int dfim;
	private Date dfimDateTime;
	private int rmUser;
	private Date rmDateTime;
	private int svUser;
	private Date svDateTime;
	private String comment;
	public void setApplyId(int applyId){
		this.applyId = applyId;
	}
	public int getApplyId(){
		return applyId;
	}
	public void setDealerId(int dealerId){
		this.dealerId = dealerId;
	}
	public int getDealerId(){
		return dealerId;
	}
	public void setInsureCompanyId(int insureCompanyId){
		this.insureCompanyId = insureCompanyId;
	}
	public int getInsureCompanyId(){
		return insureCompanyId;
	}
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	public Date getStartDate(){
		return startDate;
	}
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	public Date getEndDate(){
		return endDate;
	}
	public void setCommision(double commision){
		this.commision = commision;
	}
	public double getCommision(){
		return commision;
	}
	public void setStatus(int status){
		this.status = status;
	}
	public int getStatus(){
		return status;
	}
	public void setDfim(int dfim){
		this.dfim = dfim;
	}
	public int getDfim(){
		return dfim;
	}
	public void setDfimDateTime(Date dfimDateTime){
		this.dfimDateTime = dfimDateTime;
	}
	public Date getDfimDateTime(){
		return dfimDateTime;
	}
	public void setRmUser(int rmUser){
		this.rmUser = rmUser;
	}
	public int getRmUser(){
		return rmUser;
	}
	public void setRmDateTime(Date rmDateTime){
		this.rmDateTime = rmDateTime;
	}
	public Date getRmDateTime(){
		return rmDateTime;
	}
	public void setSvUser(int svUser){
		this.svUser = svUser;
	}
	public int getSvUser(){
		return svUser;
	}
	public void setSvDateTime(Date svDateTime){
		this.svDateTime = svDateTime;
	}
	public Date getSvDateTime(){
		return svDateTime;
	}
	public void setComment(String comment){
		this.comment = comment;
	}
	public String getComment(){
		return comment;
	}
}
