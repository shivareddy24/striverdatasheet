/*
Problem Name    : Majority Element-I
Platform        : Striver A2Z DSA Sheet
Topic           : Arrays
Approach        : Boyer-Moore Voting Algorithm
Description     : Find the element that appears more than n/2 times.
                  Since the majority element is guaranteed to exist,
                  Boyer-Moore efficiently finds it in one traversal.

Example:
Input  : [7, 0, 0, 1, 7, 7, 2, 7, 7]
Output : 7

Time Complexity : O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = majorityElement(nums);
        System.out.println("majority element: " + ans);
        sc.close();
    }
}
