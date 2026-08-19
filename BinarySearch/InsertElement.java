/*
Problem Name   : Insert Element
Platform       : Arrays
Topic          : Linear Search
Approach       : Find the Correct Insertion Position
Description    : Traverse the sorted array and find the position where
                 the given key can be inserted while maintaining the
                 sorted order. The key is inserted between two elements
                 when arr[i] < key and key <= arr[i+1].

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 11-08-2026
*/

import java.util.*;

class InsertElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key value : ");
        int key = sc.nextInt();
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] < key && key <= arr[i+1]){
                System.out.println("Element is inserted at position " + (i+1));
                break;
            }
        }
         sc.close();
    }
}
