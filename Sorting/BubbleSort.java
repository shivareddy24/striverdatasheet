/*
Problem Name    : Bubble Sort
Platform        : Striver DSA A2Z sheet
Topic           : Sorting Algorithms
Approach        : Repeatedly compare adjacent elements and swap them
                  if they are in the wrong order. After each pass,
                  the largest unsorted element moves to its correct
                  position at the end of the array.

Description     : Read an array of integers from the user and sort
                  it in ascending order using the Bubble Sort
                  algorithm. Finally, print the sorted array.

Example Input   :
5
64 34 25 12 22

Example Output  :
12 22 25 34 64

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 13-07-2026
*/


import java.util.Scanner;
class BubbleSort{
    public static void main(String[] args){
        System.out.println("enter size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n; i++){
            for(int j=0;j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
