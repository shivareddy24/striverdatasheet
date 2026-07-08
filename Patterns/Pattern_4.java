/*
Problem Name    : Pattern 4
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to print a right-angled pattern where
                  each row contains the same number equal to the row index.
Description     : Print N rows. In each row, print the current row number
                  repeatedly for as many times as the row number.
                  The outer loop controls the rows, while the
                  inner loop prints the row number.

Example Input   : 5
Example Output  :
1
22
333
4444
55555

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
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();
    }
}
