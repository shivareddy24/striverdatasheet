/*
Problem Name   : Palindrome Check in Doubly Linked List
Platform       : Striver DSA Sheet
Topic          : Linked List
Approach       : Use two pointers starting from the head and tail of the list.
                 Compare elements from both ends while moving toward the center.
                 If any pair of values differs, the list is not a palindrome.
Description    : Checks whether the elements of a doubly linked list read the
                 same forward and backward.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 15-03-2026
*/


import java.util.*;

class Palindrom_LL{

	Node head;
	Node tail;
	class Node{

		int data;
		Node next;
		Node prev;

		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
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
		head.prev=newnode;
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

	public int position(){
		Node curr = head;
		int count=0;

		while(curr != null){
			curr=curr.next;
			count++;
		}
		return count;
	}
	public void palindrom(int c){

		if(head == null || head.next == null){
			System.out.println("LL id palindrom ");
			return;
		}
	
		Node curr1=head;
		Node curr2=tail;

		for(int i=0;i<c/2;i++){
			if(curr1.data != curr2.data){
				System.out.println("LL is not palindrom ");
			}	
			curr1 = curr1.next;
			curr2 = curr2.prev;
		}	

		System.out.println("LL id palindrom ");
	}			
	
	public static void main(String[] args){

		 Palindrom_LL list=new Palindrom_LL();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of LL : ");
		int n= sc.nextInt();

		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			list.addFirst(x);
		}

		int l = list.position();
		list.palindrom(l);
		
	}
}
