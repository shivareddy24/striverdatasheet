/*
Problem Name   : Check if Array is Sorted
Platform       : IsSorted
Topic          : Arrays
Approach       : Single Pass Comparison
Description    : Check whether the given array is sorted in 
                 non-decreasing order.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 05-03-2026
*/

import java.util.*;

class IsSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean isSorted = true;


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is NOT sorted");

        sc.close();
    }
}
