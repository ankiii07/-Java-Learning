package loops;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			if(i==35) 
//			{
//				break;
//			}
//			System.out.println(i);
//		}
		
		for(;;)
		{
			int n = sc.nextInt();
			if(n<0)
				break;
		}

	}

}
