package methods;
import java.util.*;

public class Introduction {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int firstNum = sc.nextInt();
	int secondNum = sc.nextInt();
	
	int result = maxiOf(firstNum,secondNum); // method calling
	 
	System.out.println("maximumof two number is "+ result);
	
	sayHi(); //not passing parameters
	
	}
	static int maxiOf(int a,int b) //creating methods
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	static void sayHi() //not passing parameters
	{
		System.out.println("Hii");
		System.out.println("Good Morning");
	}
}
