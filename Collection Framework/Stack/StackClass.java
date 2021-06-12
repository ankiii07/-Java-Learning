package stack;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(12);
		st.push(67);
		st.push(78);
		st.push(32);
		
		int popped = st.pop();
		System.out.println(popped);
		
		int peeked = st.peek();
		System.out.println(peeked);
		
	}

}
