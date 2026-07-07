// Pattern_8

/*
Problem Name    : Pattern 8
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use four nested loops to print an inverted pyramid
                  star pattern. The first loop controls the rows,
                  the second prints leading spaces, the third prints
                  stars in decreasing odd numbers, and the fourth
                  prints trailing spaces.

Description     : Print an inverted pyramid consisting of stars.
                  The number of leading spaces increases with each
                  row, while the number of stars decreases by two,
                  maintaining the pyramid shape.

Example Input   : 5

Example Output  :
*********
 *******
  *****
   ***
    *

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 07-07-2026
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * n - 2 * i + 1); k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= (i - 1); l++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
