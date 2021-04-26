package conditionalStatements;
import java.util.Scanner;

public class NestedIfElseStatement {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		int a = 4;
//		int b = 5;
//		int c = 8;
//		
//		if(a > b)
//		{
//			if(a > c)
//			{
//				System.out.println("max of three =" + a);
//			}
//			else 
//			{
//				System.out.println("max of three =" + c);
//			}
//		}
//		else
//		{
//			if(b > c)
//			{
//			System.out.println("max of three =" +b);
//			}
//			else
//			{
//				System.out.println("max of three =" + c);
//			}
//		}

		int max = a > b ? a > c ? a : c: b > c ? b : c;
		
		System.out.println(max);
	}

}
