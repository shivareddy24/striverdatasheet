/*
Problem Name   : Count Occurrence
Platform       : Striver A2Z DSA Sheet
Topic          : Arrays
Approach       : Linear Search
Description    : Traverse the array and compare each element with the
                 given key value. Whenever the element matches the key,
                 increment the count by 1.

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 12-08-2026
*/

import java.util.*;

public class Count_Occurence{
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
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == x){
                count += 1 ;
            }
        }    
        System.out.println("count is : " +count);
    }
}
