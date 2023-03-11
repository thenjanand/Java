/*
 	Assignment 7
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	1 1 1 1 1
 	2   0 1 1 1 1
 	3	0 0 1 1 1
 	4   0 0 0 1 1
 	5	0 0 0 0 1
 */
public class AS7 {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print("0 ");
			}
			for (j = i; j <= 5; j++) {
				System.out.print("1 ");
			}
			System.out.println();

		}

	}

}
