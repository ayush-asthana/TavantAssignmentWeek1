package day1;

public class Factorial {

	static int factorial(int num) {
		if(num<0) {
			System.out.print("Factorial cannot be calculated for negative numbers ");
			return 0;
		}
		if(num==0)
			return 1;		
		return num*factorial(num-1);
	}

}
