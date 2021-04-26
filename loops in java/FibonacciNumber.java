package loops;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
         int n = sc.nextInt();
          
         int a=0;
         int b=1;
         System.out.print(a+" ");
         System.out.print(b+" ");
         
        int c=0;
        for(int i = 0 ; i <= n-2; i++)
        {
        	c = a + b;
        	System.out.print(c+" ");
        	a=b;
        	b=c;
        }
	}

}
