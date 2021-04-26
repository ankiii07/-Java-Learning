package loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
         int n = sc.nextInt();
         int power = 1;
         
         System.out.println("enter the number of power :  ");
         int y = sc.nextInt();
         
         if(y==0)
         {
        	 System.out.println("answer is always 1");
         }
         else
         {
        	 for(int i = 1 ; i <= y ; i++)
        	 {
        		 power = power * n;
             }
        	 System.out.println(power);
         }

	}

}
