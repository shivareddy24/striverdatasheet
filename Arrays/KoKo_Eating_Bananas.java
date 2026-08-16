/*
Problem Name    : Koko Eating Bananas
Platform        : Striver A2Z DSA Sheet
Topic           : Binary Search
Approach        : Binary Search on Answer. Search for the minimum
                  eating speed from 1 to the maximum pile. For each
                  speed, calculate the total hours required.
Description     : Find the minimum number of bananas Koko must eat
                  per hour to finish all piles within h hours.

Example Input   : arr = [3, 5, 6, 8, 9, 11], h = 10
Example Output  : 6

Time Complexity : O(n log(max(arr)))
Space Complexity: O(1)
*/

import java.util.*;
public class KoKo_Eating_Bananas {
    public static int finding(int[] arr,int n,int h){
        int low = 1 ;
        int high = 0 ;

        for(int i = 0;i<n;i++){
            if(arr[i] > high)
                high = arr[i] ;
        }

        while(low<high){
            int mid = low + (high - low)/2 ;
            int hours = 0 ;

            for (int i = 0; i < n; i++) {
                hours += (arr[i] + mid - 1) / mid;
            }
            
            if(hours <= h){
                high = mid ;
            }
            else{
                low = mid + 1 ;
            }
        }
        return low ;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Hours : ");
        int h = sc.nextInt();

        int result = finding(arr,n,h);
        System.out.println("Minimum No:of bananas to at per hour : " +result);
    } 
}
