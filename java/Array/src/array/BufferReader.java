package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws  IOException  
	{
		  int i;
	        System.out.println("enter the array element");
	        InputStreamReader isr= new InputStreamReader(System.in);
	        BufferedReader ib= new BufferedReader(isr);
	        int a[]=new int [5];
	        for(i=0;i<5;i++)
	        {
	            a[i]= Integer.parseInt(ib.readLine());

	        }
	        for(i=0;i<5;i++)
	        {
	            System.out.println(a[i]);
	        }

	}

}
