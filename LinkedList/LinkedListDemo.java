/*
Problem Name   : Singly Linked List Basic Operations
Platform       : Practice / Self
Topic          : Linked List
Approach       : Implement a Node class and perform operations using head pointer.
Description    : Supports addFirst, addLast, deleteFirst, deleteLast, and display operations.
Time Complexity: O(1) for addFirst/deleteFirst, O(n) for addLast/deleteLast
Space Complexity: O(n)
Author         : Shiva Reddy
Date           : 07-03-2026
*/

class LinkedListDemo{
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

		Node newnode =new Node(data);
		if(head == null){
			head=newnode;
			return;
		}
		
		newnode.next=head;
		head=newnode;
	}

	public void addLast(String data){

		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
			return;
		}

		Node currnode = head;
		while(currnode.next != null){
			currnode=currnode.next;
		}
		currnode.next=newnode;
	}

	public void display(){

		Node currnode = head;
		
		while(currnode != null){
			System.out.print(currnode.data +"--->");
			currnode=currnode.next;
		}
		
		System.out.println("NULL");
	}
	
	public void deleteFirst(){
	
		if(head == null){		
			System.out.println("no data is present ony NULL");
			return;
		}
	
		head=head.next;	
	}

	public void deleteLast(){
	
		if(head == null){		
			head.next=null;
			return;
		}

		if(head.next == null){		
			System.out.println("no data is present ony NULL");
			return;
		}

		Node Lastnode = head.next;
		Node SecondLast = head;

		while(Lastnode.next != null){
			Lastnode=Lastnode.next;
			SecondLast=SecondLast.next;
		}
		SecondLast.next=null;
	}

	public static void main(String[] args){
		LinkedList list = new LinkedList();

		System.out.println("after adding nodes");
		list.addFirst("first");
		list.addFirst("my");
		list.addFirst("is");
		list.display();
		System.out.println("after adding first and last nodes");
		list.addFirst("this"); 
		list.addLast("linkedlist");
		list.display();
		System.out.println("after deleting nodes");
		list.deleteFirst();
		list.deleteLast();
		System.out.println("finally");
		list.addFirst("this");
		list.addLast("linkedlist");
		list.display();
	}
}
