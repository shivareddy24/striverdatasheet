//Pattern_11
/*
Problem Name    : Pattern 11
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to print a triangular pattern.
                  Maintain a counter that increments after printing
                  each element. Print '1' for odd counter values and
                  '0' for even counter values.
Description     : Print a triangle of alternating binary digits.
                  The binary values continue alternately across rows
                  instead of restarting from each new row.

Example Input   : 5
Example Output  :
1
01
010
1010
10101

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 09-07-2026
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                if (count % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }

        sc.close();
    }
}
