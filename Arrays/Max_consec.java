/*
Problem Name   : Maximum Consecutive Ones in Binary Array
Platform       : Arrays
Topic          : Sliding Window / Counting
Approach       : Traverse and Count Consecutive 1s
Description    : Iterate through the array and maintain a running 
                 count of consecutive 1s. Reset the count when a 0 
                 is encountered, and track the maximum count found.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 22-03-2026
*/

import java.util.*;

class Max_consec{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of binary array");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++; 
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }

        System.out.println("maximum count is " + max);
    }
}
