/*
Problem Name   : Search in Rotated Sorted Array II
Platform       : Striver A2Z DSA Sheet
Topic          : Arrays / Binary Search
Approach       : Modified Binary Search
Description    : Search for the key in a rotated sorted array with duplicates.
                 If duplicates make it impossible to identify the sorted half,
                 shrink the search space from both ends.

Time Complexity: O(log n) average, O(n) worst case
Space Complexity: O(1)
*/

import java.util.*;
public class Rotated_sorted_array_2 {

    public static boolean search(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return true;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= key && key < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] < key && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
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
        System.out.println("Enter the key value : ");
        int k = sc.nextInt();

        boolean result = search(arr, 0, n - 1, k);
        System.out.println(result);
    }
}
