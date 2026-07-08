/*
Problem Name   : Singly Linked List Basic Operations
Platform       : StriverDSAsheet
Topic          : Linked List
Approach       : Implement a Node class and perform operations using head pointer.
Description    : Supports addFirst, addLast, deleteFirst, deleteLast, and display operations.
Time Complexity: O(1) for addFirst/deleteFirst, O(n) for addLast/deleteLast
Space Complexity: O(n)
Author         : Shiva Reddy
Date           : 07-03-2026
*/

import java.util.*;
	
class MiddleNode_LL{
	Node head;

	class Node{
		int data;
		Node next;
	
		Node(int data){

			this.data=data;
			this.next=null;
		}
	}

	public void addFirst(int data){
		
		Node newnode=new Node(data);
		if(head == null){
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	public Node Mid_Ele(){
		if(head==null)
			return null;

		Node mid1=head;
		Node mid2=head;
	
		while(mid2!=null && mid2!=null){
			mid1=mid1.next;
			mid2=mid2.next.next;
		}
		return mid1;
			
	}
	public static void main(String[] args){


		MiddleNode_LL list=new MiddleNode_LL();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size id LinkedList : ");

		int n=sc.nextInt();

		for(int i=0;i<n;i++){
    			int x = sc.nextInt();
    			list.addFirst(x);
		}
		
		Node  mid = list.Mid_Ele();
	
		System.out.println("middle element is " + mid.data);
		
	}
}

