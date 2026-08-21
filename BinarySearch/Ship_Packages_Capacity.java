/*
Problem Name    : Ship Packages Within D Days
Platform        : Striver A2Z DSA Sheet
Topic           : Binary Search
Approach        : Binary Search on Answer. Search for the minimum ship
                  capacity between the maximum package weight and the
                  total weight. For each capacity, calculate the number
                  of days required to ship all packages in order.
Description     : Find the minimum ship capacity required to ship all
                  packages within the given number of days.
Time Complexity : O(n * log(sum of weights))
Space Complexity: O(1)
*/

import java.util.*;
 class Ship_Packages_Capacity{

    public static int solution(int[] arr,int n,int days){
        int low = arr[n-1];
        int high = 0 ;
        int ans = -1 ; 

        for(int i=0;i<n;i++){
            high += arr[i] ;
        }

        while(low <= high){
            int mid = low + (high - low )/2 ;
            int load = 0 ;
            int day = 1 ;

            for(int i= 0; i<n; i++){
                if(load + arr[i]> mid){
                    day += 1 ;
                    load = arr[i];
                }
                else{
                    load += arr[i];
                }
            }
            
            if(day <= days){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n = sc.nextInt();
        System.out.print("Enter the Weights : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Days : ");
        int day = sc.nextInt();

        int result = solution(arr,n,day);
        System.out.println(result);
 }
}
