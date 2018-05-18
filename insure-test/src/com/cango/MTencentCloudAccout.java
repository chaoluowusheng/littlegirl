package	com.cango;
public class MTencentCloudAccout {
	private String appId;
	private String secretId;
	private String secretKey;
	private String region;
	public void setAppId(String appId){
		this.appId = appId;
	}
	public String getAppId(){
		return appId;
	}
	public void setSecretId(String secretId){
		this.secretId = secretId;
	}
	public String getSecretId(){
		return secretId;
	}
	public void setSecretKey(String secretKey){
		this.secretKey = secretKey;
	}
	public String getSecretKey(){
		return secretKey;
	}
	public void setRegion(String region){
		this.region = region;
	}
	public String getRegion(){
		return region;
	}
}
