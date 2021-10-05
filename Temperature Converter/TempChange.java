/*
TempChange.java
S Slav
10/6/2020
*/
public class TempChange{
	//Data Member
	private String goAgain;
	private String userInput;
	public boolean celsius;//User has to enter their value in celsius (Cel->Fahr)
	public boolean fahrenheit;//User has to enter their value in fahrenheith (Fahr -> Cel)
	private double celsiusInput;
	private double fahrenheitInput;
	private double celsiusOutput;//Fahr -> Cels
	private double fahrenheitOutput;//Cels -> Fahr
	//Constructor
	public TempChange(){
		goAgain="";
		userInput="";
		celsius=false;
		fahrenheit=false;
		celsiusInput=0.0;
		fahrenheitInput=0.0;
		celsiusOutput=0.0;
		fahrenheitOutput=0.0;
	}
	//Setters
	public void setCelsiusInput(double celsiusInput){
		this.celsiusInput=celsiusInput;
	}
	public void setFahrenheitInput(double fahrenheitInput){
		this.fahrenheitInput=fahrenheitInput;
	}
	//Process
	public void celsiusConverter(){
		//Converts celsius into farhenheit
		fahrenheitOutput=(celsiusInput*9/5)+32;
	}
	public void fahrenheitConverter(){
		//Converts farhenheit into celsius
		celsiusOutput=(fahrenheitInput-32)*5/9;
	}
	//Getters
	public double getCelsiusOutput(){
		return celsiusOutput;
	}
	public double getFahrenheitOutput(){
		return fahrenheitOutput;
	}
	public boolean getCeslius(){
		return this.celsius;
	}
}