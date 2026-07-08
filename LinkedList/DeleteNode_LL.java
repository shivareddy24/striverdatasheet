/*
Problem Name      : Reverse a Singly Linked List
Platform          : Striver DSA Sheet
Topic             : Linked List

Approach          :
Use an iterative technique with three pointers:
1. prev  -> keeps track of the previous node
2. curr  -> points to the current node
3. next  -> temporarily stores the next node
Traverse the list and reverse the 'next' pointer of each node
so that it points to its previous node instead of the next one.
Description       :
This program creates a singly linked list, displays the original
list, reverses the list using pointer manipulation, and then
prints the reversed linked list.

Time Complexity   : O(n)   // Traverses the list once
Space Complexity  : O(1)   // No extra memory used

Author            : Shiva Reddy
Date              : 13-03-2026
*/


import java.util.*;

class DeleteNode_LL{

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

	public void delete(int key){

		Node curr=head;
		Node prev=null;

		if(curr!=null && curr.data==key ){
			head=curr.next;
			return;
		}
		while(curr != null && curr.data !=key){
			prev=curr;
			curr=curr.next;
		}
		if( curr == null){
			System.out.println("Node not found :");
			return;
		}
		prev.next=curr.next;		
	}			
	
	public static void main(String[] args){

		DeleteNode_LL list=new DeleteNode_LL();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of LL : ");
		int n= sc.nextInt();

		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			list.addFirst(x);
		}
		System.out.println("LinkedList original : ");
		list.display();
		
		System.out.println("Enter element to be deleted :");
		int y =sc.nextInt();

		System.out.println("LinkedList after deleteing : ");
		list.delete(y);
		list.display();
	}
}
