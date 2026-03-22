/*
Problem Name   : Sort 0s, 1s and 2s
Platform       : Arrays
Topic          : Counting Technique (Dutch National Flag - Variant)
Approach       : Count Frequencies and Overwrite
Description    : Count the number of 0s, 1s, and 2s in the array, 
                 then overwrite the array with these values in order.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 22-03-2026
*/

public class SortZeroOneTwo {
    public static void main(String[] args){
        int arr[] = {0,0,1,2,1,0,1,2,1,2,0,0};
        int n=arr.length;
        int c1=0;
        int c2=0;
        int c0=0;

        System.out.print("Elements are :  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        for(int i=0; i<n ; i++){
            if(arr[i] == 0) c0++;
            else if(arr[i] == 1) c1++;
            else c2++;
        }

        System.out.print("soeted array is :  ");

        int i=0;
        while(c0-- > 0) arr[i++] = 0;
        while(c1-- > 0) arr[i++] = 1;
        while(c2-- > 0) arr[i++] = 2;

        for(int val : arr){
            System.out.print(val +" ");
        }
    }
}
