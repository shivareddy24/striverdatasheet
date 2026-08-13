/*
Problem Name    : Search Element in Rotated Sorted Array
Platform        : Striver A2Z DSA Sheet
Topic           : Arrays / Binary Search
Approach        : Use Modified Binary Search. At each step, identify
                  which half of the rotated array is sorted. Then check
                  whether the key lies within that sorted half and
                  eliminate the other half.

Description     : A rotated sorted array is an originally sorted array
                  that has been rotated at some pivot. The array is
                  searched efficiently by identifying the sorted half
                  and applying binary search logic.

Example Input   : 10
                  7 8 1 2 3 3 3 4 5 6
                  3

Example Output  :
                  Element found at index : 4

Time Complexity : O(log n) average case
                  O(n) worst case when duplicates are present
Space Complexity: O(1)
Date            : 13-08-2026
*/

import java.util.Scanner;

public class SearchElement_In_RotatedArray {
    public static int search(int[] arr,int low,int high,int k){
        
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            else {
                if (arr[mid] < k && k <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the Rotated array elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key value : ");
        int k = sc.nextInt();

        int result = search(arr,0,n-1,k);
    }    
}

