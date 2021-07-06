package lists.linkedList;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ld = new LinkedList<>();
		
		ld.add(56);
		ld.add(78);
		ld.add(23);
		ld.add(90);
		
		//into array
		ld.toArray();
		
		ld.set(4, 56);
		
		System.out.println(ld.get(0));
		
	
		
	}

}
