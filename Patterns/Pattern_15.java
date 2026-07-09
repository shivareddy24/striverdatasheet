/*
Problem Name    : Pattern 15
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to print an inverted right-angled
                  alphabet pattern. The outer loop decreases the number
                  of rows, while the inner loop prints alphabets from
                  'A' up to the current limit.
Description     : Print N rows where the first row contains alphabets
                  from 'A' to the Nth alphabet, and each subsequent row
                  prints one fewer alphabet, forming an inverted triangle.

Example Input   : 5
Example Output  :
		ABCDE
		ABCD
		ABC
		AB
		A

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 06-07-2026
*/

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();
    }
}
