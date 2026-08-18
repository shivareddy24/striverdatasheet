/*
Problem Name    : Kth Missing Number
Platform        : Striver A2Z DSA Sheet
Topic           : Binary Search
Approach        : Binary Search to find the position where the k-th missing
                  number occurs. Calculate missing numbers using
                  arr[mid] - (mid + 1).
Description     : Find the k-th missing positive number from a sorted array.
Time Complexity : O(log n)
Space Complexity: O(1)
*/

import java.util.*;
class Kth_Missing_Number{
    public static int missingnumber(int[] arr,int n,int k){
        int low = 0;
        int high = n - 1;

        while (low <= high) { 
           int mid = low + (high-low)/2 ;
           int missing = arr[mid] - (mid + 1); 

           if(missing<k)
            low = mid + 1;
           else
            high = mid - 1;
        }
        return low + k;
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

        System.out.println("Enter the k value : ");
        int k = sc.nextInt();

        int result = missingnumber(arr,n,k);
        System.out.print(result);
    }
}

