/*
 	Assignment 4
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	5 5 5 5 5
 	2	4 4 4 4 4
 	3	3 3 3 3 3
 	4	2 2 2 2 2
 	5	1 1 1 1 1
 */
public class AS4 {

	public static void main(String[] args) {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= 5; j++) {

				System.out.print(i + " ");

			}
			System.out.println();
		}

	}

}
