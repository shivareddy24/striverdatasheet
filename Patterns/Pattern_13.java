//Pattern_13
/*
Problem Name    : Pattern 13
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to print a triangular pattern.
                  Maintain a counter that increments after printing
                  each number so that the sequence continues across
                  all rows.
Description     : Print Floyd's Triangle, where consecutive natural
                  numbers are arranged in a right-angled triangular
                  pattern.

Example Input   : 5
Example Output  :
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

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
                System.out.print(count + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
