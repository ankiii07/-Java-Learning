package exceptionHandling;

import java.util.Scanner;

public class DiffTypesOfException {

	public static void main(String[] args) {
		
		try {
			// Arithmetic Exception
			Scanner sc = new Scanner(System.in);
			int a= 7;
			int b = sc.nextInt();
			
			int c = a/b;
			System.out.println(c);
			
			// for array out of bound exception
			
			int arr[] = new int[5];
			
			System.out.println(arr[6]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" occured , check your code");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage()+" index is out of the range");
		}
		finally {
			System.out.println("sorry for Inconvenience");
		}
	}

}
