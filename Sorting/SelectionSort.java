/*
Problem Name    : Selection Sort
Platform        : Striver A2Z DSA Sheet
Topic           : Sorting
Approach        : Repeatedly find the minimum element from the unsorted
                  portion of the array and place it at the beginning
                  of the unsorted section by swapping it with the
                  current element.

Description     : Selection Sort divides the array into sorted and
                  unsorted parts. During each pass, it selects the
                  smallest element from the unsorted portion and
                  places it in its correct position. It is an
                  in-place sorting algorithm but is not stable.

Example Input   : 6
                  64 25 12 22 11 90

Example Output  :
                  11 12 22 25 64 90

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 13-07-2026
*/

import java.util.Scanner;

class SelectionSort {

    public static void main(String[] args) {

        System.out.println("Enter size of the array:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            int min = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
