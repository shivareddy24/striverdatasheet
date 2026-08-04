/*
Problem Name    : Merge Two Sorted Arrays
Platform        : Arrays
Topic           : Two Pointers
Approach        : Merge from the End (Backward Traversal)
Description     : Given two sorted arrays, merge nums2 into nums1 in-place.
                  Since nums1 has enough extra space at the end, start
                  comparing elements from the last valid positions of both
                  arrays. Place the larger element at the end of nums1 and
                  move the corresponding pointer backward. Finally, copy
                  any remaining elements of nums2.

Example
Input :
nums1 = [1, 2, 3, 0, 0, 0], m = 3
nums2 = [2, 5, 6], n = 3

Output:
[1, 2, 2, 3, 5, 6]

Time Complexity : O(m + n)
Space Complexity: O(1)

Author          : Shiva Reddy
Date            : 04-08-2026
*/

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;

        int j = n - 1;

        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println("Before Merge:");
        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("nums2 = " + Arrays.toString(nums2));

        merge(nums1, m, nums2, n);

        System.out.println("\nAfter Merge:");
        System.out.println(Arrays.toString(nums1));
    }
}
