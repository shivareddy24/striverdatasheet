/*
Problem Name   : Search Element in Linked List
Platform       : StriverDSAsheet
Topic          : Linked List
Approach       : Traverse the linked list from head and compare each node
                 with the key. If found, print the position of the element.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 10-03-2026
*/

class SearchLinkedList{

	Node head;   // Head pointer of the linked list

	// Node class representing each element of the linked list
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	// Method to insert a node at the beginning of the list
	public void addFirst(int data){

		Node newnode = new Node(data);

		// If list is empty
		if(head == null){
			head = newnode;
			return;
		}

		// Insert node at the beginning
		newnode.next = head;
		head = newnode;
	}

	// Method to display elements of the linked list
	public void display(){

		Node currnode = head;

		while(currnode != null){
			System.out.print(currnode.data + " -> ");
			currnode = currnode.next;
		}

		System.out.println("NULL");
	}

	// Method to search an element in the linked list
	public void search(int key){

		Node currnode = head;
		int position = 1;

		// Traverse the linked list
		while(currnode != null){

			if(currnode.data == key){
				System.out.println("Found in position : " + position);
				return;
			}

			currnode = currnode.next;
			position++;
		}

		// If element not present
		System.out.println("Element not found");
	}

	// Main method
	public static void main(String[] args){

		SearchLinkedList SSL = new SearchLinkedList();

		// Inserting elements into linked list
		SSL.addFirst(45);
		SSL.addFirst(44);
		SSL.addFirst(5);
		SSL.addFirst(85);
		SSL.addFirst(65);
		SSL.addFirst(15);
		SSL.addFirst(435);
		SSL.addFirst(4);
		SSL.addFirst(18);

		System.out.println("Elements are :");
		SSL.display();

		// Searching for element 15
		SSL.search(15);
	}
}
