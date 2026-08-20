/*
Problem Name   : Peak Element
Platform       : Arrays
Topic          : Linear Search
Approach       : Compare Element With Its Neighbors
Description    : Traverse the array and find the first element that is
                 greater than both its left and right neighbors.
                 The element must satisfy arr[i-1] < arr[i] > arr[i+1]
                 to be considered a peak element.

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 11-08-2026
*/

import java.util.*;

class PeakElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {

            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.println("Element is " + arr[i] + " found at " + i);
                break;
            }
        }
         sc.close();
    }
}
