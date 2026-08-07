/*
 * Problem Name   : Majority Element (> n/3 times)
 * Approach       : Extended Boyer-Moore Majority Vote Algorithm
 * Description    :
 *     - At most 2 elements can appear more than n/3 times.
 *     - Step 1: Traverse array to find two potential candidates.
 *     - Step 2: Verify their actual counts.
 *     - Step 3: Return those exceeding n/3.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Author         : Shiva Reddy
 */

import java.util.*;
class MajorityElement{
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2};
        System.out.println("Output: " + majorityElement(nums));
    }
}
