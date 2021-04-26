package loops;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number : ");
		
		int n = sc.nextInt();
		
		int count = 0;
		
		while(n>0)
		{
			n = n/10;
			count++;
		}
		System.out.println("total number of digits : " +count);
		
		int counts =   (int)Math.log10(n) +1;
		System.out.println(counts);

	}

}
