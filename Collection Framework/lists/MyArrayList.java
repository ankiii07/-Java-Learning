package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List <String> fruits = new ArrayList<String>();
		List <String> vegie = new LinkedList<String>();
		
		//Returns the element at the specified position in this list.
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("mango");
		
		vegie.add("tomato");
		vegie.add("brinjal");
		vegie.add("potato");
		vegie.add("cucumber");
		
		//Appends all of the elements in the specified collection to the end of this list
		fruits.addAll(vegie);
		System.out.println(fruits);
		System.out.println(vegie);
		
		//Returns the element at the specified position in this list.
		fruits.get(4);
		System.out.println(fruits.get(4));
		System.out.println(fruits);
		System.out.println(vegie);
		
		//Appends all of the elements in the specified collection to the end ofthis list
		fruits.set(1, "banana");
		vegie.set(2, "chilly");
		System.out.println(fruits);
		System.out.println(vegie);
		
		//Removes the element at the specified position in this list
		fruits.remove(2);
		vegie.remove(3);
		System.out.println(fruits);
		System.out.println(vegie);
		
		//Removes from this list all of its elements that are contained in thespecified collection
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Apple");
		fruits.removeAll(toRemove);
 		System.out.println(fruits);
		System.out.println(vegie);
		
		System.out.println(fruits.size());
		System.out.println(vegie.size());
		
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.contains("banana"));
		
		//Change Array to Array List
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		
		for(String e: temp)
		{
			System.out.println(e);
		}
		
		ArrayList<Integer> marks = new ArrayList<>();
		
		Pair<String, Integer> p1 = new Pair<>();
		
	}

}
