/*
Problem Name    : Pattern 9
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two pyramid patterns. The first half prints an
                  upright pyramid with increasing odd numbers of stars,
                  while the second half prints an inverted pyramid with
                  decreasing odd numbers of stars.

Description     : Print a diamond star pattern by combining an upright
                  pyramid and an inverted pyramid. The upper half
                  increases the number of stars, and the lower half
                  decreases them symmetrically.

Example Input   : 5

Example Output  :
    *
   ***
  *****
 *******
*********
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
