/*
Problem Name   : Count Rotations in a Rotated Sorted Array
Platform       : Striver A2Z DSA Sheet
Topic          : Arrays / Binary Search
Approach       : Binary Search
Time Complexity: O(log n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 15-08-2026
*/

import java.util.*;
public class RotatedArray_Count{
    public static int search(int[] arr,int low, int high) {
         while (low < high) {

            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[high])
                low = mid + 1;
            else 
                high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the Rotated array elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = search(arr,0,n-1);
        if(result <= n/2)
	   System.out.println("The array rotated by Right side by  : " + result + " times ");
	else
	   System.out.println("The array rotated by Left side by  : " + (n-result) + " times ");
    }
}
