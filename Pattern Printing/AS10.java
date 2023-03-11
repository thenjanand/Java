/*
 	Assignment 10
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	        5
 	2         4 5
 	3	    3 4 5
 	4     2 3 4 5
 	5	1 2 3 4 5
 */
public class AS10 {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (j = i; j <= 5; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

	}

}
