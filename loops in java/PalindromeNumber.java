package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the number : ");
			int n = sc.nextInt();
			int reverse = 0;
			int digit = 0;
			int temp =n;
			
			while (temp>0)
			{
				digit = temp%10;
				reverse = reverse *10 + digit;
			}
			if(reverse==temp)
			{
				System.out.println("palindrome number");
			}
			else
			{
				System.out.println("not palindrome number");
			}
			
	}

}
