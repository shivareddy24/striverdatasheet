/*
Problem Name    : Insertion Sort
Platform        : Striver DSA A2Z sheet
Topic           : Sorting Algorithms
Approach        : Divide the array into sorted and unsorted parts.
                  Take one element from the unsorted part and insert
                  it into its correct position in the sorted part.

Description     : Read an array of integers from the user and sort
                  it in ascending order using the Insertion Sort
                  algorithm. Finally, print the sorted array.

Example Input   :
5
64 34 25 12 22

Example Output  :
12 22 25 34 64

Time Complexity : Best Case    : O(n)
                  Average Case : O(n²)
                  Worst Case   : O(n²)
Space Complexity: O(1)
Date            : 13-07-2026
*/

import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
