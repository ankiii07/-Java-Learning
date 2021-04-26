package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i = 0; i < 10; i = i + 1)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
		
		for(int i=100;i>0;i--)
		{
			System.out.println(i);
		}
		for(int i = 0; i<=10; i++)
		{
		   int 	product = 2 * i;
		   System.out.println(product);
		}
	}

}
