package	com.cango;
public class MSequence {
	private String name;
	private int currentValue;
	private int increment;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setCurrentValue(int currentValue){
		this.currentValue = currentValue;
	}
	public int getCurrentValue(){
		return currentValue;
	}
	public void setIncrement(int increment){
		this.increment = increment;
	}
	public int getIncrement(){
		return increment;
	}
}
