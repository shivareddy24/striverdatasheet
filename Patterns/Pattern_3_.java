
Problem Name    : Pattern 3
Platform        :Striver A2Z DSA sheet 
Topic           : Nested Loops
Approach        : Use two nested loops to print a right-angled number pattern.
Description     : Print N rows where each row contains numbers
                  starting from 1 up to the current row number.
                  The outer loop controls the rows, while the
                  inner loop prints the sequence of numbers.

Example Input   : 5
Example Output  :
1
12
123
1234
12345

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 06-07-2026
*/




import java.util.Scanner;

public class Pattern_3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
