/*
Problem Name   : Insert Element at First in Linked List
Platform       : StriverDSAsheet
Topic          : Linked List
Approach       : Create a new node and make it point to the current head.
                 Then update head to the new node.
Description    : This program inserts elements at the beginning of a
                 singly linked list and displays the list.
Time Complexity: O(1) for insertion
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 08-03-2026
*/


class InsertFirst{
	Node head;
	
	class Node{
	
		String data;
		Node next;

		Node(String data){

			this.data=data;
			this.next=null;
		}
	}	
	public void addFirst(String data){

		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
			return;
		}

		newnode.next=head;
		head=newnode;
	}

	public void display(){
	
		Node currnode=head;
		while(currnode != null){
			System.out.print(currnode.data +"---> ");
			currnode=currnode.next;
		}
		System.out.println("NULL");
	}	
	
	public static void main(String[] args){
	
		InsertFirst add=new InsertFirst();
		
		add.addFirst("apple");
		add.addFirst("banana");
		add.addFirst("cherry");
		add.addFirst("watermelon");
		add.addFirst("Fruits");
		add.addFirst("This_are");
	
		add.display();
	}

}	
