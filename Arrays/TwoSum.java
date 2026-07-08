/*
Problem Name   : Two Sum (Find Pair with Given Sum)
Platform       : Arrays / Hashing
Topic          : HashMap
Approach       : Complement Search using HashMap
Description    : Traverse the array and for each element, compute 
                 the difference (target - element). Check if the 
                 difference already exists in the HashMap. If yes, 
                 a valid pair is found.
Time Complexity: O(n)
Space Complexity: O(n)
Author         : Shiva Reddy
Date           : 22-03-2026
*/

import java.util.*;

public class TwoSum {
    public static void main(String[] args){

        System.out.println("Enter the array : " );
        int[] arr={4,5,2,1,3,7,8,2,0};
        int n=arr.length;
        int target=8;

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n ; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                System.out.println("[" +diff+ ","+arr[i]+ "]");
            }
            map.put(arr[i],i);
        } 
    } 
}
