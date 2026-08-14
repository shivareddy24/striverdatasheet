/*
Problem Name   : Minimum Element in a Rotated Sorted Array
Platform       : Striver A2Z DSA Sheet
Topic          : Arrays / Binary Search
Approach       : Binary Search
Description    : Use binary search to find the minimum element
                 in the rotated sorted array.

Time Complexity: O(log n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 15-08-2026
*/
import java.util.*;
public class MininumElement_In_RotatedArray{
    public static int search(int[] arr,int low, int high) {
         while (low < high) {

            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[high])
                low = mid + 1;
            else 
                high = mid;
        }
        return arr[low];
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
        System.out.println("Minimum element in rotated array is : " + result);
    }
}
