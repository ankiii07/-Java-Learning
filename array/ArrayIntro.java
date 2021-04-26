package array;

public class ArrayIntro {

	public static void main(String[] args) {
//		int[] marks = new int[5];
//		
//		int marks[] = new int[5];
//		
//		int[] rollNos, classes;
//		
//		System.out.println(marks[0]);
		
		int[] age = {34,67,45,31,53,74,87,92,100};
		double[] marks = {45.89,63,89,67.23,89.83,34.78,72.90,94.99,98.45};
		marks[1] = 56.89;
		
		System.out.println(age[6]);
		System.out.println(marks[7]);
		
		for(int i = 0; i<age.length;i++)
		{
			System.out.print(age[i]+" ");
		}
		System.out.println();
		for(int i = 0; i<marks.length;i++)
		{
			System.out.print(marks[i]+ " ");
		}
	}

}
