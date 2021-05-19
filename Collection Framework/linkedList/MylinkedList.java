package lists.linkedList;

public class MylinkedList {
	
	Node head;             // head of linked list

	class Node               // Linked list Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}                     //Constructor
	}

	//traverse the linked list
	public void printList()
	{
		Node temp =  head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	
	// Insert the node at beginning/front
	
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	// Insert at after the node

	public void insertAfter(int new_data, Node prev_node)
	{
		if(prev_node==null)
		{
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node = new_node;
	}
	
	// insert at the last position
	
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head==null)
		{
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		
		Node temp = head;
		while(temp!=null)
		{
			temp = temp.next;
		}
		temp.next =new_node;
		return;
	}
	
	// deletion of linked list if key element is given
	
	public void deleteNode(int key)
	{
		Node temp = head, prev = null;
		
		if(temp == null)
		{
			return;
		}
		if(temp!=null && temp.data == key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key) 
		{
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}
	
	// delete the linked list according to position is given
	public void delete(int pos)
	{
		Node temp = head;
		if(head == null)
		{
			return;
		}
		if(pos == 0)
		{
			head = temp.next;
			return;
		}
		for(int i = 0;i<pos-1;i++)
		{
			if(temp!=null)
			{
				temp =  temp.next;
			}
		}
		if(temp==null || temp.next==null)
		{
			Node next = temp.next.next;
			temp.next = next;
		}
	}

}
