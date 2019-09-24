package day1;

public class SumOfNumbers {
	
	public boolean isValid(int number)
	{
		boolean isValidflag=true;
		if(number<0)
			isValidflag=false;
		
		return isValidflag;
	}
	
	int sumOfEvenNumbers(int start, int end)
	{
		if(!isValid(start) && !isValid(end))
			return 0;
		
		int evenSum=0;
		if(start%2==1)
			start++;
		for(int i=start;i<=end;i=i+2)
		{
				evenSum+=i;
		}
		return evenSum;
	}
	
	int sumOfOddNumbers(int start, int end)
	{
		if(!isValid(start) && !isValid(end))
			return 0;
		
		int oddSum=0;
		if(start%2==0)
			start++;
		
		for(int i=start;i<=end;i=i+2)
		{
				oddSum+=i;
		}
		return oddSum;
	}
	

}
