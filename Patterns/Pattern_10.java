/*
Problem Name    : Pattern 10
Platform        : Striver A2Z DSA Sheet
Topic           : Nested Loops
Approach        : Print the upper half of the pattern using increasing
                  stars from 1 to N. Then print the lower half using
                  decreasing stars from N-1 to 1.
Description     : Print a half diamond star pattern. The first part
                  forms a right-angled triangle with increasing stars,
                  while the second part forms an inverted right-angled
                  triangle with decreasing stars.

Example Input   : 5
Example Output  :
*
**
***
****
*****
****
***
**
*

Time Complexity : O(n²)
Space Complexity: O(1)
Date            : 09-07-2026
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
        
	 for(int k=1; k<i; k++){
		System.out.print("*");
	    }
	                System.out.println();
        }

	 for (int i = 1; i<=n; i++) {

           for(int k=n; k>=i; k--){
		System.out.print("*");
	    }
	                System.out.println();
        }

        sc.close();
    }
}

