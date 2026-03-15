/*
Problem Name   : Segregate Odd and Even Nodes in Singly Linked List
Platform       : Striver DSA Sheet 
Topic          : Linked List
Approach       : Use two pointers (odd and even) to separate nodes based on their positions.
                 Traverse the list while maintaining links between odd nodes and even nodes.
                 Finally attach the even list after the odd list.
Description    : Rearranges the linked list such that all nodes at odd positions appear first,
                 followed by nodes at even positions while maintaining their original order.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 15-03-2026
*/

import java.util.*;

class Segregate_LL{

	Node head;
	Node tail;
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
			tail = newnode;
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

	public void seg_LL(){

		if(head == null || head.next == null){
			return;
		}
	
		Node odd=head;
		Node even=odd.next;
		Node evenstart=even;

		while(even != null && even.next!=null){
			odd.next = even.next;
			odd=odd.next;

			even.next=odd.next;
			even=even.next;
		}
		odd.next=evenstart;
					
	}			
	
	public static void main(String[] args){

		Segregate_LL list=new Segregate_LL();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of LL : ");
		int n= sc.nextInt();

		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			list.addFirst(x);
		}
		System.out.println("LinkedList original : ");
		list.display();
		
		System.out.println("LinkedList after segregation: ");
		list.seg_LL();
		list.display();
	}
}
