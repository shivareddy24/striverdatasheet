/*
Problem Name    : Pattern 7
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use three nested loops to print a centered pyramid.
                  The first loop prints leading spaces, the second
                  loop prints stars, and the third loop prints
                  trailing spaces for proper alignment.
Description     : Print a pyramid of height N where the number of
                  stars in each row increases by 2, forming a
                  centered pyramid.

Example Input   : 5
Example Output  :
    *
   ***
  *****
 *******
*********

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 06-07-2026
*/

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= (n - i); l++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
