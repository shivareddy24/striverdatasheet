/*
Problem Name    : Pattern 21
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to traverse an N × N grid.
                  Print '*' only when the current position lies on
                  the border; otherwise, print a space.
Description     : Print a hollow square pattern where stars appear
                  along the outer boundary and the inside remains
                  empty.

Example Input   : 5
Example Output  :
*****
*   *
*   *
*   *
*****

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 09-07-2026
*/

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
