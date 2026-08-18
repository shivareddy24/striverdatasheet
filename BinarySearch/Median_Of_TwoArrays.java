/*
Problem Name    : Median of Two Sorted Arrays
Platform        : Striver A2Z DSA Sheet
Topic           : Arrays
Approach        : Merge both sorted arrays using two pointers, then find
                  the median of the merged array.
Description     : Merges two sorted arrays into a third array and calculates
                  the median based on whether the total number of elements
                  is odd or even.
Time Complexity : O(n1 + n2)
Space Complexity: O(n1 + n2)
*/

import java.util.*;
public class Median_Of_TwoArrays {
    
    public static double median(int[] a1, int[] a2,int[] a3){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<a1.length && j<a2.length){
            if(a1[i]<=a2[j]){
                a3[k] = a1[i];
                i++;
            }
            else{
                a3[k] = a2[j];
                j++;
            }
            k++;
        }

        while(i < a1.length){
            a3[k] = a1[i];
            i++;
            k++;
        }
        while(j < a2.length){
            a3[k] = a2[j];
                j++;
                k++;
        }

        int n = a3.length;
        if(n%2 != 0){
            return a3[n / 2];
        }
        else
            return (a3[n / 2 - 1] + a3[n / 2]) / 2.0;

        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array-I Size : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Array-I elements : ");
        int[] a1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter the Array-II Size : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the Array-II elements : ");
        int[] a2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        int n3 = n1 + n2 ;
        int[] a3 = new int[n3];
        double result = median(a1,a2,a3);
        System.out.println("Median of two arrays is : " + result);
    }
}
