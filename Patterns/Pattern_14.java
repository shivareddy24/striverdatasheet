/*
Problem Name    : Pattern 14
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to print a right-angled alphabet pattern.
Description     : Print N rows where each row contains alphabets
                  starting from 'A' up to the current row.
                  The outer loop controls the rows, while the
                  inner loop prints the sequence of alphabets.

Example Input   : 5
Example Output  :
		A
		AB
		ABC
		ABCD
		ABCDE

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 06-07-2026
*/

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();
    }
}
