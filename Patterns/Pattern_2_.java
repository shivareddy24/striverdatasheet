/*
Problem Name    : Pattern 2
Platform        : Pattern Problems
Topic           : Nested Loops
Approach        : Use nested loops to print a right-angled triangle.
Description     : Print a right-angled triangle consisting of '*'
                  characters. The outer loop controls the number
                  of rows, while the inner loop prints stars equal
                  to the current row number.

Time Complexity : O(n²)
Space Complexity: O(1)
Author          : Shiva Reddy
Date            : 05-07-2026
*/

import java.util.Scanner;

public class Pattern_2_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
