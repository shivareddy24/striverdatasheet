/*
Problem Name   : Remove Duplicates from Sorted Array (Display Unique Elements)
Platform       : Arrays
Topic          : Two Pointer Technique
Approach       : Compare Adjacent Elements
Description    : Traverse the sorted array and print elements only 
                 when they differ from the next element. This ensures 
                 only unique elements are displayed, followed by 
                 placeholders for removed duplicates.
Time Complexity: O(n)
Space Complexity: O(1)
Author         : Shiva Reddy
Date           : 22-03-2026
*/

public class Repeated_Element {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,5,5};
        int n=arr.length;
        int j=0;

        System.out.print("Elements in array are:  ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i] +" ");
                j++;
            }
        }

        System.out.print(arr[n-1] +" ");
        j++;

        for(int i=j;i<n;i++){
            System.out.print("_ ");
        }
    }
}
