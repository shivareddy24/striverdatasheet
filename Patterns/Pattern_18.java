/*
Problem Name    : Pattern 20
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Print the upper half by increasing the number of
                  stars while decreasing the spaces in the middle.
                  Then print the lower half by decreasing the stars
                  while increasing the middle spaces.
Description     : Print a symmetric butterfly pattern. The upper
                  half consists of two right-angled triangles
                  separated by spaces, while the lower half is the
                  mirror image of the upper half.

Example Input   : 5
Example Output  :
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

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

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            for (int l = 0; l < n - i; l++) {
                System.out.print(" ");
            }

            for (int m = 0; m < i; m++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }

            for (int m = 0; m < n - i; m++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
