package sortingAlgo;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the size of array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int temp;
		
		System.out.println("enter the elements of array : ");
		for(int i = 0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(" the enelements of array : ");
		for(int i = 0 ; i<n ; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		for(int i = 0 ; i<n-1 ; i++)
		{
			boolean sorted = true;
			for(int j = 0 ; j<n-i-1 ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					
					sorted = false;
				}
			}
			if(sorted)
				break;
		}
		
		System.out.println("After Bubble Sort the elements of array : ");
		for(int item: arr)
		{
			System.out.print(item + " ");
		}

	}

}
