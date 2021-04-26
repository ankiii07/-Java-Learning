package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		
//                 *   
//               *   *   
//             *   *   *   
//           *   *   *   *   
//         *   *   *   *   *   
//       *   *   *   *   *   *  

   
		     
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k = 0; k<n-i+1;k++)
			{
				System.out.print("*   ");
			}
		System.out.println();
		}
			
	}

}
