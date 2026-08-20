/*
Problem Name    : Find Square Root of a Number
Platform        : Striver A2Z DSA Sheet
Topic           : Binary Search
Approach        : Apply Binary Search to find the integer square root.
Description     : Find the largest number whose square is <= n.

Time Complexity : O(log n)
Space Complexity: O(1)
Author          : Shiva Reddy
Date            : 15-08-2026
*/

import java.util.*;
public class SquareRoot {
    public static int squareroot(int n){
        int low = 1;
        int high = n ;
        int ans = 0 ;

        while(low < high){
            int mid = low + (high - low)/2 ;
            if(mid <= n/mid){
                low = mid + 1;
                ans = mid;
            }
            else{
                high = mid - 1 ;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = squareroot(n);
        System.out.println("Square root of " + n + " is " +result);
    }
}
