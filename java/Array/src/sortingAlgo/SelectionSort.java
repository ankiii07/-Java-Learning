package sortingAlgo;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
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
		
		for(int i = 0 ; i<n ; i++)
		{
			for(int j = i+1 ; j<n ; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Selection Sort the elements of array : ");
		for(int item: arr)
		{
			System.out.print(item + " ");
		}
	}

}
