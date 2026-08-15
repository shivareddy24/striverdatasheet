/*
Problem Name    : Search in Rotated Sorted Array
Platform        : Striver A2Z DSA Sheet
Topic           : Arrays / Binary Search
Approach        : Modified Binary Search
Description     : Identify the sorted half of the rotated array and
                  check whether the key lies within that half.
                  Search continues in the appropriate half.

Time Complexity : O(log n)
Space Complexity: O(1)
*/

import java.util.*;
public class Rotated_sorted_array_1 {

    public static int search(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= key && key < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else {
                if (arr[mid] < key && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
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
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key value : ");
        int k = sc.nextInt();

        int result = search(arr, 0, n - 1, k);
        if (result != -1)
            System.out.println("Element found at index : " + result);
        else
            System.out.println("Element not found");
    }
}
