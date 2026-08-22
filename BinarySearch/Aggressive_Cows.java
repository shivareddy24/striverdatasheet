/*
Problem Name    : Aggressive Cows
Platform        : Striver A2Z DSA Sheet
Topic           : Binary Search
Approach        : Binary Search on Answer. Search for the maximum possible
                  minimum distance between any two cows. For each distance,
                  check whether all cows can be placed in the stalls while
                  maintaining at least that distance.
Description     : Place the given number of cows in the stalls such that the
                  minimum distance between any two cows is maximized.
*/

import java.util.*;

public class Aggressive_Cows {
    public static int distance(int[] arr,int n,int cows){

      Arrays.sort(arr);
      int low = 1;
      int high =arr[n - 1] - arr[0];
      int ans = -1;

    while(low<=high){

        int mid = low + (high-low)/2;
        int count_cow = 1;
        int last = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i] - last >= mid){
                last = arr[i] ;
                count_cow += 1 ;
            }
        }

        if (count_cow >= cows) {
            ans = mid;
            low = mid + 1;
        } 
        else {
            high = mid - 1;
        }
    }
    return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stalls : ");
        int n = sc.nextInt();
        System.out.println("Enter the each stall size : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the No:of cows : ");
        int cows = sc.nextInt();

        System.out.println(distance(arr,n,cows));
    }
}
