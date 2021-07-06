package array;
import java.util.Scanner;

public class AverageMarksOfClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of Students : ");
		 int n = sc.nextInt();
		 System.out.println("enter the marks of Students : ");
		 double[] marks = new double[n];
		 double average = 0;
		 
		 for(int i = 0;i<n;i++)
		 {
			 marks[i]=sc.nextDouble();
		 }
		 for(int i = 0; i<n; i++)
		 {
			 average = average + marks[i];
		 }
		 System.out.println("sum of marks" +average);
		 average = average/n;
		 
		 System.out.println("average marks of student : " +average);

	}

}
