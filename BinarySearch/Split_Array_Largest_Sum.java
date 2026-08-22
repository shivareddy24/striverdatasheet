/*
Problem Name    : Split Array Largest Sum
Platform        : Striver A2Z DSA Sheet
Topic           : Binary Search
Approach        : Binary Search on Answer. Search for the minimum
                  possible largest sum of any subarray. For each
                  possible sum, greedily split the array into subarrays.
Description     : Split the array into k non-empty consecutive subarrays
                  such that the largest subarray sum is minimized.
*/

import java.util.*;

class Split_Array_Largest_Sum{
    public static int subarrays(int[] arr,int k){
        int low = 0;
        int high = 0;
        int ans = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>low)
                low = arr[i];
            high+=arr[i];
        }

        while(low<=high){
            int load = 0 ;
            int sub = 1;
            int mid = low+(high-low)/2;

            for(int i=0;i<arr.length;i++){
                if(load+arr[i] <= mid){
                    load+=arr[i];
                }
                else{
                    sub++;
                    load = arr[i];
                }
            }

            if(sub<=k){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid+1;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the No:of subarrays : ");
        int k = sc.nextInt();

        System.out.println(subarrays(arr,k));
    }
}
