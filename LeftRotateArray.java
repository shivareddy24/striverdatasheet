/*
Problem Name   : Left Rotate Array by One Position
Platform       : LeftRotateArray
Topic          : Arrays
Approach       : Adjacent Swapping (Single Pass)
Description    : Rotate the array to the left by one position 
                 by swapping each element with its next element.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 05-03-2026
*/

class LeftRotateArray {
    public static void main(String[] args) {

        // Input array
        int[] a = {2, 3, 4, 5, 6};
        int n = a.length;

        int temp = 0;

        // Print original array
        System.out.print("Before rotated array is ");
        for (int k = 0; k < n; k++) {
            System.out.print(" " + a[k]);
        }

        // Rotate array left by one position
        for (int i = 0; i < n - 1; i++) {
            temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        // Print rotated array
        System.out.println("\nRotated array is ");
        for (int j = 0; j < n; j++) {
            System.out.print(" " + a[j]);
        }
    }
}
