/*
Problem Name   : Maximum Subarray Sum (Kadane’s Algorithm)
Source         : Striver DSA Sheet
Approach       : Traverse the array while maintaining current sum.
                 Reset sum to 0 if it becomes negative.
                 Track maximum sum and subarray indices.
Description    : Finds the contiguous subarray with the largest sum
                 and also prints the elements of that subarray.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 05-04-2026
*/

public class KadaneAlgorithm {

    public static int MaxSubarray(int[] arr,int n) {
        int sum = 0, maxSum = 0;
        int start = 0, end = 0;

        for(int i = 0; i < n; i++){

            if(sum == 0) start = i;

            sum += arr[i];

            if(sum > maxSum){
                maxSum = sum;
                end = i;
            }

            if(sum < 0) sum = 0;
        }

        System.out.print("Max Elements are: ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,-5,1,-2,3,-4,5,-1,6};

        System.out.println("Maximum sum of subarray: " + MaxSubarray(arr, arr.length));
    }
}
