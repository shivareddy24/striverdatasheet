/*
Problem Name   : Union of Two Arrays using HashSet
Platform       : Arrays
Topic          : Hashing
Approach       : Use HashSet to Store Unique Elements
Description    : Add all elements from both arrays into a HashSet.
                 Since HashSet stores only unique values, duplicates 
                 are automatically removed. Then print the set.
Time Complexity: O(n + m)
Space Complexity: O(n + m)
Author         : Shiva Reddy
Date           : 22-03-2026
*/

import java.util.*;

public class Union_Of_Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet<Integer> set = new HashSet<>();

        for(int val : arr1){
            set.add(val);
        }

        for(int val : arr2){
            set.add(val);
        }

        System.out.print("Union: ");
        for(int val : set){
            System.out.print(val + " ");
        }
    }
}
