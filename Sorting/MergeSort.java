/*
Problem Name    : Merge Sort
Platform        : Striver A2Z DSA Sheet
Topic           : Sorting
Approach        : Use the Divide and Conquer technique. Recursively divide
                  the array into two halves until each subarray contains
                  only one element. Then merge the sorted subarrays by
                  comparing their elements and storing them in sorted order.
Description     : Merge Sort recursively splits the array into smaller
                  subarrays and merges them back in sorted order. It is
                  a stable sorting algorithm with a guaranteed time
                  complexity of O(n log n) in all cases.

Example Input   : 6
                  5 2 9 1 6 3

Example Output  :
                  1 2 3 5 6 9

Time Complexity : O(n log n)
Space Complexity: O(n)
Date            : 10-07-2026
*/

import java.util.*;

class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];
        int[] temp = new int[n1 + n2];
        for (int i = 0; i < n1; i++)
            left[i] = arr[low + i];

        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                temp[k++] = left[i++];
            else
                temp[k++] = right[j++];
        }
        while (i < n1)
            temp[k++] = left[i++];
        while (j < n2)
            temp[k++] = right[j++];
        for (int l = 0; l < k; l++)
            arr[low + l] = temp[l];
    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        mergeSort(arr, 0, n - 1);

        System.out.print("Sorted array: ");

        for (int num : arr)
            System.out.print(num + " ");

        sc.close();
    }
}
