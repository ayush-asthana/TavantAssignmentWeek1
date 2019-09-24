package day1;
import java.text.DecimalFormat;
public class Temprature {

double convertToFarenheit(Double celsius) {
		
		double result=celsius*9/5+32;
		DecimalFormat dec=new DecimalFormat("#0.00");
		return Double.parseDouble(dec.format(result));
	}
	
 double convertToCelsius(Double fahrenheit) {
		
		double result=(fahrenheit-32)*5/9;		
		DecimalFormat dec=new DecimalFormat("#0.00");
		return Double.parseDouble(dec.format(result));
	}

}
