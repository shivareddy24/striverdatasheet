/*
Problem Name   : Reverse a Singly Linked List
Platform       : StriverDSAsheet
Topic          : Linked List
Approach       : Iterative Method using three pointers (prev, curr, next).
                 Traverse the linked list and reverse the direction of
                 each node's next pointer.
Description    : This program creates a singly linked list, displays the
                 original list, reverses the list, and prints the reversed list.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 13-03-2026
*/

import java.util.*;

class Reverse_LL{

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
	
	public void reverse(){

		Node curr=head;
		Node prev=null;
		
		while(curr != null){
			Node next=curr.next;

			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head = prev;
	}

	public static void main(String[] args){

		Reverse_LL list=new Reverse_LL();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of LL : ");
		int n= sc.nextInt();

		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			list.addFirst(x);
		}
		System.out.println("LinkedList original : ");
		list.display();
		
		System.out.println("LinkedList after reversing : ");
		list.reverse();
		list.display();
	}
}
