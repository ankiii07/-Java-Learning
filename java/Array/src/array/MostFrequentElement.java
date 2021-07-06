package array;
import java.util.*;

public class MostFrequentElement {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int count =1;
		 int maxCount = 1;
		 int arr[] = new int[n];
		 int res = arr[0];
		 for(int i = 0; i<n;i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		 Arrays.sort(arr);
		 for(int i = 1; i<n;i++)
		 {
			 if(arr[i]==arr[i-1])
			 {
				 count++;
			 }
			 else
			 {
				 if(count>maxCount)
				 {
					maxCount=count;
					res = arr[i-1];
				 }
				 count = 1;
			 }
		 }
		 if(count>maxCount)
		 {
			maxCount=count;
			res = arr[n-1];
		 }
		 System.out.println(res);
		 System.out.println(maxCount);

	}

}
