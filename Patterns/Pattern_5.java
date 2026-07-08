/*
Problem Name    : Pattern 5
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to print an inverted right-angled
                  star pattern. The outer loop controls the rows, while
                  the inner loop prints decreasing numbers of stars.
Description     : Print N rows where the first row contains N stars and
                  each subsequent row contains one less star, forming
                  an inverted right-angled triangle.

Example Input   : 5
Example Output  :
                 *****
                 ****
                 ***
                 **
                 *

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 06-07-2026
*/

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
