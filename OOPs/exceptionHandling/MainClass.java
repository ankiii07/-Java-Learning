package exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int a= 4;
			int b = 0;
			
			int c= a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()+" occured , check your code");
		}
		
		System.out.println("this is very importtant line");
		System.out.println("it is necessary to run to hndle exception");
	}

}
