package	com.cango;
public class IGapContractSign {
	private int contractid;
	private String contractno;
	private String mobile;
	private String carchassisno;
	private String brand;
	private String brandname;
	private String carseries;
	private String carseriesname;
	private double carprice;
	private Date createdatetime;
	private int createuser;
	private Date lastupdatetime;
	private int updateuser;
	public void setContractid(int contractid){
		this.contractid = contractid;
	}
	public int getContractid(){
		return contractid;
	}
	public void setContractno(String contractno){
		this.contractno = contractno;
	}
	public String getContractno(){
		return contractno;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return mobile;
	}
	public void setCarchassisno(String carchassisno){
		this.carchassisno = carchassisno;
	}
	public String getCarchassisno(){
		return carchassisno;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrandname(String brandname){
		this.brandname = brandname;
	}
	public String getBrandname(){
		return brandname;
	}
	public void setCarseries(String carseries){
		this.carseries = carseries;
	}
	public String getCarseries(){
		return carseries;
	}
	public void setCarseriesname(String carseriesname){
		this.carseriesname = carseriesname;
	}
	public String getCarseriesname(){
		return carseriesname;
	}
	public void setCarprice(double carprice){
		this.carprice = carprice;
	}
	public double getCarprice(){
		return carprice;
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
