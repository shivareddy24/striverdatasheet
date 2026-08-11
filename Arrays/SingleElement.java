/*
Problem Name   : Single Element in a Sorted Array
Platform       : Arrays
Topic          : Linear Search
Approach       : Check Elements in Pairs
Description    : Traverse the sorted array by comparing adjacent elements.
                 If two consecutive elements are equal, move to the next
                 pair using low += 2. If they are different, the current
                 element is the single element. The last element is also
                 checked separately if it is the single element.

Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 11-08-2026
*/
import java.util.*;

class SingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;

        while(low < n-1){
            if(arr[low] == arr[low+1])
                low += 2 ;
            else{
                System.out.println("Single element is " + arr[low]);
                break;
            }
        }
         if (low == n - 1) {
            System.out.println("Single element is " + arr[low]);
        }
        sc.close();
    }
}
