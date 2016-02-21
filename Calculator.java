
package cse360assign3;

public class Calculator {

	private int total;
	private String str;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		str = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		str = str + " + " + String.valueOf(value);
	}
	
	public void subtract (int value) {
		total = total - value;
		str = str + " - " + String.valueOf(value);
	}
	
	public void multiply (int value) {
		total = total * value;
		str = str + " * " + String.valueOf(value);
	}
	
	public void divide (int value) {
		if(value == 0){
			total = 0;
		}
		else{
			total = total / value;
		}
		str = str + " / " + String.valueOf(value);
	}
	
	public String getHistory () {
		return str;
	}
}
