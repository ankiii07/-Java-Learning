package exceptionHandling;

public class MainClass2 {

	public static void main(String[] args) {
		try {
		    fun1();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void fun1()
	{
		int a= 5;
		int b = 0;
		
		int c= a/b;
		System.out.println(c);
	}
}
