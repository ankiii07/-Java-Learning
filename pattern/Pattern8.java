package pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//	            1  
//	          2  3  
//	        4  5  6  
//	      7  8  9  10  
//	    11  12  13  14  15  
//	  16  17  18  19  20  21
		
		   int num =1;
				for(int i=n;i>=0;i--)
				{
					for(int j=0;j<=i;j++)
					{
						System.out.print("  ");
					}
					for(int k = 0; k<n-i+1;k++)
					{
						System.out.print(num+"  ");
						num++;
					}
				System.out.println();
				}
		
	}

}
