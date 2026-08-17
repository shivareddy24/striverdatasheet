/*
*
* Problem Name    : Minimum Number of Bouquets
* Platform        : Striver A2Z DSA Sheet
* Topic           : Binary Search
* Approach        : Binary Search on Answer. Search for the minimum
*                   number of days from the minimum to maximum bloom day.
*                   For each day, count the possible bouquets using
*                   consecutive bloomed flowers.
* Description     : Find the minimum number of days required to make
*                   m bouquets, where each bouquet needs k consecutive flowers.
*
* Time Complexity : O(n log(max(arr)))
* Space Complexity: O(1)
*
*/

import java.util.*;

public class Minimum_Bouquets {
    public static int bouquets(int[] arr,int n,int m,int k){
        int low = arr[0];
        int high = 0 ;
        int ans = -1 ;

        for(int i=0; i<n; i++){
            if(low > arr[i])
                low = arr[i];
            if(high < arr[i])
                high = arr[i];
        }

        while(low <= high){

            int bouquet = 0;
            int flowers = 0;
            int mid = low + (high-low)/2 ;

            for(int i=0; i<n; i++){

                if(arr[i] <= mid){
                    flowers += 1 ;
                    if(flowers == m){
                        bouquet += 1 ;
                        flowers = 0;
                    }
                }
                else
                    flowers = 0;

            }
           if(bouquet >= k){
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
        System.out.println("Enter the size of BloomDay : ");
        int n = sc.nextInt();
        System.out.println("Enter the No:of roses : ");
        int[] bloomday = new int[n];
        for(int i=0; i<n; i++){
            bloomday[i] = sc.nextInt();
        }
        System.out.println("Enter the No:of flowers : ");
        int m = sc.nextInt();
        System.out.println("Enter the Bouquets count : ");
        int k = sc.nextInt();

        System.out.println(bouquets(bloomday,n,m,k));
    }
}
