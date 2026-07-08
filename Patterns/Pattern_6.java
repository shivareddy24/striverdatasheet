/*
Problem Name    : Pattern 6
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops. The outer loop controls the
                  number of rows in decreasing order, while the inner
                  loop prints numbers from N down to 1 using the
                  expression (N - j + 1). The number of elements
                  printed decreases by one in each row.
Description     : Print an inverted right-angled number pattern where
                  each row starts from N and decreases to 1, with one
                  fewer number printed in every subsequent row.

Example Input   : 5
Example Output  :
        54321
        5432
        543
        54
        5

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 06-07-2026
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }

        sc.close();
    }
}
