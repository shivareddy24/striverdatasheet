/*
Problem Name   : First and Last Occurrence
Platform       : Striver A2Z DSA Sheet
Topic          : Arrays
Approach       : Linear Search
Description    : Traverse the array from left to right to find the first
                 occurrence of the given key and traverse from right to
                 left to find the last occurrence.
                 If the key is not found, return -1 for that position.

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 12-08-2026
*/
import java.util.*;

public class First_And_Last_Occurence{
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
        int first = -1 ;
        int last = -1 ;

        for(int i=0; i<n; i++){
            if(arr[i]==x){
                first = i;
                break;
            }
        }
        for(int i=n-1; i >= 0; i--){
            if(arr[i]==x){
                last = i;
                break;
            }
        }
        System.out.println("First and Last Element found at [ " + first + " , " + last + " ]");
    }
}
