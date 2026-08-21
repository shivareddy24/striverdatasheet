/*
Problem Name    : Kth Element in Two Sorted Arrays
Platform        : Striver A2Z DSA Sheet
Topic           : Binary Search / Arrays
Approach        : Merge the two sorted arrays into a third array while
                  maintaining sorted order. The Kth element is then found
                  using index K - 1.
Description     : Find the Kth smallest element from two sorted arrays.
                  Merge both arrays into a single sorted array and return
                  the element at index K - 1.
Time Complexity : O(n1 + n2)
Space Complexity: O(n1 + n2)
*/

import java.util.*;
public class Kth_Element_In_TwoSorted_Arrays {
    
   public static int kthElement(int[] a1, int[] a2, int[] a3, int K) {

    int i = 0;
    int j = 0;
    int k = 0;

    while(i < a1.length && j < a2.length) {

        if(a1[i] <= a2[j]) {
            a3[k] = a1[i];
            i++;
        }
        else {
            a3[k] = a2[j];
            j++;
        }

        k++;
    }

    while(i < a1.length) {
        a3[k] = a1[i];
        i++;
        k++;
    }

    while(j < a2.length) {
        a3[k] = a2[j];
        j++;
        k++;
    }

    return a3[K - 1];
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
        System.out.println("Enter the element to search: ");
        int K = sc.nextInt();
        double result = kthElement(a1,a2,a3,K);
        System.out.println("element lies in the position : " + result);
    }
}
