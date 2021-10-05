/*
TempChangeApp.java
S Slav
10/6/2020
*/
import javax.swing.JOptionPane;
public class TempChangeApp{
	public static void main(String args[]){
		//Variables
		String goAgain;
		String userInput;
		boolean celsius;
		boolean fahrenheit;
		double celsiusInput;
		double fahrenheitInput;
		double celsiusOutput;
		double fahrenheitOutput;
		//Objects
		TempChange myTemp = new TempChange();

		JOptionPane.showMessageDialog(null,"Welcome to my temperature converter");
		JOptionPane.showMessageDialog(null,"To convert celsius to fahrenheit, enter Celsius");
		JOptionPane.showMessageDialog(null,"To convert farhenheit to celsius, enter Farenheit");

		do{
			userInput=JOptionPane.showInputDialog(null,"Which would you like to convert? Celsius or Farhenheit");

			//Error Checking
			if(userInput.equalsIgnoreCase("Celsius")){
				fahrenheitInput=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your values in celsius"));
				myTemp.setFahrenheitInput(fahrenheitInput);
				celsius=true;
			}
			else{
				celsiusInput=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your value in fahrenheits"));
				myTemp.setCelsiusInput(celsiusInput);
				fahrenheit=true;
			}

			//Process
			myTemp.celsiusConverter();
			myTemp.fahrenheitConverter();

			//Output
			celsiusOutput=myTemp.getCelsiusOutput();
			fahrenheitOutput=myTemp.getFahrenheitOutput();

			if(myTemp.celsius==true){
				JOptionPane.showMessageDialog(null,fahrenheitOutput+" degrees in Fahrenheits");
			}
			else{
				JOptionPane.showMessageDialog(null,celsiusOutput+" degrees in Celsius");
			}

			goAgain=JOptionPane.showInputDialog(null,"Enter yes to go again");
		}while(goAgain.equalsIgnoreCase("Yes"));
	}
}