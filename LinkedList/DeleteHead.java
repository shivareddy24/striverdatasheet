/*
Problem Name   : Delete Head Node in Linked List
Platform       : Practice / Self
Topic          : Linked List
Approach       : If the linked list is not empty, move the head pointer
                 to the next node (head = head.next) to delete the first node.
Description    : This program deletes the first node (head node) of a
                 singly linked list and displays the remaining elements.
Time Complexity: O(1)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 08-03-2026
*/


class DeleteHead{
	Node head;
	
	String data;
	Node next;
	
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

	
	public void Delete(){

		Node currnode=head;
		if(head==null){
			System.out.println("NULL");
		}
		
		head=head.next;
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
	
		DeleteHead add=new DeleteHead();
		
		add.addFirst("apple");
		add.addFirst("banana");
		add.addFirst("cherry");
		add.addFirst("watermelon");
		add.addFirst("Fruits");
		add.addFirst("This_are");
		System.out.println("elements before deleting");
		add.display();
		System.out.println("after deleting");
		add.Delete();
		add.display();
	}

}	
