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

Time Complexity : O(m + n)
Space Complexity: O(1)
Author          : Shiva Reddy
Date            : 04-08-2026
*/

class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

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
}
