/*
Problem Name   : Upper Bound
Platform       : Arrays
Topic          : Linear Search
Approach       : Find the First Element Greater Than Key
Description    : Traverse the sorted array and find the first element
                 that is strictly greater than the given key value.
                 Once the first valid element is found, print it and
                 stop the loop using break.

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 11-08-2026
*/

import java.util.*;
class UpperBound{
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
        System.out.println("Enter the key value : ");
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] > x){
                System.out.println("key found - " +arr[i]);
                break;
            }
        }
    }
}
