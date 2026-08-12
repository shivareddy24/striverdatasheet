/*
Problem Name   : Floor and Ceil
Platform       : Striver A2Z DSA Sheet
Topic          : Arrays
Approach       : Linear Search
Description    : Traverse the sorted array and find the floor and ceil
                 values of the given key.
                 Floor is the largest element less than or equal to key,
                 while ceil is the smallest element greater than key.

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 12-08-2026
*/

import java.util.*;
public class Floor_And_Ceil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the floor value : ");
        int x = sc.nextInt();
        int floor = 0;
        int ceil = 0;

        for(int i=0; i<n-1; i++){
            if(arr[i]<=x && arr[i+1] > x){
                floor = arr[i];
                ceil = arr[i+1];
                break;
            }
        }
        System.out.println("floor value is " + floor + " and the ceil value " +ceil);
    }
}
