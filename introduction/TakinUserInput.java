package introduction;
import java.util.Scanner;

public class TakinUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		String girl = sc.nextLine();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(girl);

}
}
