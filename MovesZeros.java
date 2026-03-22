/*
Problem Name   : Move All Zeros to End
Platform       : Arrays
Topic          : Two Pointer Technique
Approach       : Shift Non-Zero Elements + Fill Zeros
Description    : Traverse the array and move all non-zero elements 
                 to the front while maintaining their order, then 
                 fill remaining positions with zeros.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 22-03-2026
*/

public class MovesZeros {
    public static void main(String[] args){
        int arr[]={0,1,2,5,0,8,1,0,6,0,5,4};
        int n=arr.length;
        int j=0;

        System.out.print("Elements are :  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
         System.out.println();

         for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
         }
         for(int i=j; i<n;i++){
           arr[i] = 0;
         }
        System.out.print("Elements are after sorted :  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
         System.out.println();

    }
}
