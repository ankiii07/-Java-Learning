package lists.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ld1 = new ArrayList<>();
		List<Integer> ld2 = new LinkedList<>();
		
		getTimeDiff1(ld1);
		getTimeDiff1(ld2);
		
		getTimeDiff2(ld1);
		getTimeDiff2(ld2);
	}
	
	public static void getTimeDiff1(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		
		//adding element at last position 
		for (int i = 0; i<100000; i++)
		{
			list.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("for add element at last pos.");
		System.out.println(list.getClass().getName() + " ---> " + (end - start));
	}
	
	public static void getTimeDiff2(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		
		//adding element at first position 
		for (int i = 0; i<100000; i++)
		{
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("for add element at first pos.");
		System.out.println(list.getClass().getName() + " ---> " + (end - start));
	}
	

}
