//Pattern_12
/*
Problem Name    : Pattern 12
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use nested loops to print increasing numbers from
                  1 to the current row, followed by spaces in the
                  middle, and then decreasing numbers from the current
                  row back to 1.
Description     : Print a symmetric number pattern where each row
                  begins with numbers in ascending order, contains
                  a gap of spaces that decreases with each row, and
                  ends with numbers in descending order.

Example Input   : 5
Example Output  :
1        1
12      21
123    321
1234  4321
1234554321

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 09-07-2026
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            int k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k--;
            }

            System.out.println();
        }

        sc.close();
    }
}
