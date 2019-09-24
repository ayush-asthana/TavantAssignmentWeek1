package day1;

public class MarkValidator {

	boolean  isPass(int marks)
	{
		return (marks>=40)?true:false;
	}
	
	public boolean isValidMarks(int marks)
	{
		return (marks>=1 && marks<=100)?true:false;
	}
	
	String markGrade(int marks)
	{
		if(isValidMarks(marks))
		{
		if(isPass(marks))
		{
			if(marks>90)
				return "Grade A";
			else if(marks>75)
				return "Grade B";
			else if(marks>60)
				return "Grade C";
			else
				return "Grade D";
		}
		else
			return "Fail";
		}
		return "Invalid Marks!";
	}
	
	String markGradeSwitch(int marks)
	{
		if(isValidMarks(marks))
		{
		if(isPass(marks))
		{
			switch(marks)
			{
				case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93:
				case 92: case 91:
					return "Grade A";
				case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83:
				case 82: case 81: case 80: case 79: case 78: case 77: case 76:
					return "Grade B";
				case 75: case 74: case 73: case 72: case 71: case 70: case 69: case 68:
				case 67: case 66: case 65: case 64: case 63: case 62: case 61:
					return "Grade C";
				default:
					return "Grade D";
			}
		}
		return "Fail";
		}
		else 
			return "Invalid Marks!";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarkValidator markvalidator= new MarkValidator();
		System.out.println(markvalidator.markGrade(35));
		System.out.println(markvalidator.markGradeSwitch(105));
	}

}
