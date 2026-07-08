/*
Problem Name   : Find Size of Linked List
Platform       : StriverDSAsheet
Topic          : Linked List
Approach       : Traverse the linked list from head and count each node
                 until the last node is reached.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 10-03-2026
*/

class Size_of_LL{

	Node head;  

	class Node{

		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	
	public void addFirst(int data){

		Node newnode = new Node(data);

	
		if(head == null){
			head = newnode;
			return;
		}
		
	
		newnode.next = head;
		head = newnode;
	}
	 public void display(){
	
		Node currnode = head;
		
		while(currnode != null){
			System.out.print(currnode.data + " -> ");
			currnode = currnode.next;
		}
		System.out.println("NULL");
	}


	public void print(){

		Node currnode = head;
		int count = 0;


		while(currnode != null){
			count++;
			currnode = currnode.next;
		}

		System.out.println("Size of the linked list is : " + count);
	}
	
	public static void main(String[] args){

		Size_of_LL size = new Size_of_LL();
	
		size.addFirst(45);
		size.addFirst(44);
		size.addFirst(5);
		size.addFirst(85);
		size.addFirst(65);
		size.addFirst(15);
		size.addFirst(435);
		size.addFirst(4);
		size.addFirst(18);

		System.out.println("Elements are :");
		size.display();

		size.print();
	}
}
