/*
Problem Name   : Left Rotate Array by X Positions
Platform       : StriverDSAsheet
Topic          : Arrays
Approach       : Repeated Left Rotation (Brute Force)
Description    : Rotate the array to the left by X positions 
                 by performing single left rotation X times.
Time Complexity: O(n * x)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 05-03-2026
*/


import java.util.*;

class RotateArrayBy_Xplaces{
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the no:of places to be rotated ");
	int x=sc.nextInt();

	int[] a={2,3,4,5,6};
	int n=a.length;
	int temp=0;

	System.out.print("before rotated array is ");
	for(int k=0; k<n; k++){
		System.out.print("  " +a[k]);
	}
	for(int l=0; l<x; l++){
		for(int i=0; i<n-1; i++){
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
	System.out.println("\nafter rotating array n places ");
	for(int j=0; j<n; j++){
		System.out.print(" " +a[j]);
	}
    }
}
