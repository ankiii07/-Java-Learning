package conditionalStatements;

public class IfElseIfCondition {

	public static void main(String[] args) {
		
		int number = 23;
		
		if(number<10)
		{
			System.out.println("number is less than 10");
		}
		else if(number > 10 && number< 20)
		{
			System.out.println("number is less than 20 and greater than 10");
		}
		else if(number > 20 && number <30)
		{
			System.out.println("number is less than 30 and greater than 20");
		}
		else
		{
			System.out.println("number greater than 30");
		}
	}

}
