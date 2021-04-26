package loops;

import java.util.Scanner;

public class SeriesSecond
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
         int n = sc.nextInt();
         float res1 = 0;
         float res2 = 0;
         float result = 0;
         for (float i=1 ; i<=n ; i++)
         {
        	 if(i%2==0)
        	 {
        		 res1 = res1 + 1/i;
        	 }
        	 else 
        	 {
        		 res2 = res2 +1/i;
        	 }
         }
         System.out.println(res1);
         System.out.println(res2);
         result = res2 -res1;
         System.out.println(result);

     }
}
