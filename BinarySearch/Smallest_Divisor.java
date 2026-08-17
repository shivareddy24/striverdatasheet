 /*
 Problem Name : Smallest Divisor
 Platform     : Striver A2Z DSA Sheet
 Topic        : Binary Search
 Approach     : Binary Search on Answer. Search for the smallest
                divisor from 1 to the maximum array element.
                Calculate the sum for each divisor and adjust
                the search range based on the threshold.
 Description  : Find the smallest divisor such that the sum of
                rounded-up divisions is at most the threshold.
 */

import java.util.*;

public class Smallest_Divisor {
    public static int divisor(int[] arr,int n,int k){
        int low = 1;
        int high = 0;
        int ans = -1;

        for(int i=0; i<n; i++){
            if(high < arr[i])
                high = arr[i];
        }

        while(low<=high){

            int sum = 0;
            int mid = low + (high - low)/2;

            for(int i=0; i<n; i++){
                sum = sum + (mid + arr[i] - 1)/mid;
            }

            if(sum <= k){
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

        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();

        System.out.println("Enter the Array Elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Threshold value : ");
        int k = sc.nextInt();

        System.out.println(divisor(arr,n,k));
    }
}
