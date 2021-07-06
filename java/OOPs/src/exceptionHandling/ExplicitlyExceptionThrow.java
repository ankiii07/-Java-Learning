package exceptionHandling;

public class ExplicitlyExceptionThrow {

	public static void main(String[] args) 
	{
		
		fun1();
	}
	public static void fun1()  
	{
		int a= 5;
		int b = 0;
		
		int c= a/b;
		System.out.println(c);
		boolean isDanger =true;
		if(isDanger)
		{
			throw new ArithmeticException("danger is there be careful");
		}
	}
}
