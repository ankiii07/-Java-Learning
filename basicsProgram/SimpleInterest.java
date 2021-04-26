package basicsProgram;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		double z;
		double simpleIntrest;
		z = principal * rate * time;
		simpleIntrest = z/100;
		System.out.println("the simple intrest is = " +simpleIntrest);
	}

}
