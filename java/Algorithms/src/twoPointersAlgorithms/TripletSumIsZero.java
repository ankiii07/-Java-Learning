package twoPointersAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripletSumIsZero
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		   arr[i]=Integer.parseInt(br.readLine()); 
		}
		
		for(int i = 0; i<n-2; i++)
		{
			for(int j = i+1; j<n-1; j++)
			{
				for(int k = j+1; k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						break;
					}
				}
			}
		}
		System.out.println("found");
	}
}
