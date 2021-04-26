package loops;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//sum of the digits of the number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number : ");
		
		int n = sc.nextInt();
		int sum = 0;
		int num=0;
		
		while(n>0)
			
		{
			num = n%10;
			n=n/10;
			sum = sum + num;
			System.out.println("sum of digits : " +sum);
		}
		System.out.println("sum of digits : " +sum);
		

	}

}
