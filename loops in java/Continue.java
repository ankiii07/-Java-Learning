package loops;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			if(i>=40 && i<=50) {
				continue;
			}
			System.out.println(i);
		}

	}

}
