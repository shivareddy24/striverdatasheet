/*
Problem Name    : Pattern 16
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Use two nested loops to print a right-angled alphabet
                  pattern where each row contains the same alphabet.
                  The alphabet is calculated based on the current row
                  index and is printed repeatedly.
Description     : Print N rows. The first row contains 'A', the second
                  row contains 'B' twice, the third row contains 'C'
                  three times, and so on, forming a right-angled triangle.

Example Input   : 5
Example Output  :
		A
		BB
		CCC
		DDDD
		EEEEE

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 06-07-2026
*/

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        sc.close();
    }
}
