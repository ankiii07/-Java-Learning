package loops;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
         int n = sc.nextInt();
         float sum = 0;
         float z;
         
         for(float i=1; i<=n;i++)
         {
        	 z=1/i;
        	 sum = sum + z;
         }
         System.out.println(sum);

	}

}
