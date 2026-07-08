/*
Problem Name   : Longest Subarray with Given Sum (Brute Force)
Platform       : Arrays
Topic          : Nested Loops / Subarray Traversal
Approach       : Check All Subarrays
Description    : Generate all possible subarrays using two loops.
                 For each subarray, calculate the sum and track 
                 the maximum length where sum equals k.
Time Complexity: O(n^2)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 04-04-2026
*/

public class LongestSubarray1 {

    public static int longestSubarray(int[] arr, int k, int n) {
        int max = 0;

        for(int i = 0; i < n; i++){
            int sum = 0;
            int count = 0;

            for(int j = i; j < n; j++){
                sum += arr[j];
                count++;

                if(sum == k){
                    max = count;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int n = arr.length;
        int k = 6;

        System.out.println("Longest subarray for given sum is : " 
                            + longestSubarray(arr, k, n));
    }
}
