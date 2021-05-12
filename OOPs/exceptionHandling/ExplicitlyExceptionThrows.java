package exceptionHandling;

public class ExplicitlyExceptionThrows {

	public static void main(String[] args) {
		fun1();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	static void fun1()
	{
		int a= 5;
		int b = 0;
		
		int c= a/b;
		System.out.println(c);
		
		try {
			fun2();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	static void fun2() throws Exception
	{
		boolean isDanger =true;
		if(isDanger)
		{
			throw new Exception("danger is there be careful");
		}
	}
}
