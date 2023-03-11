/*
 	Assignment 5
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	5 4 3 2 1
 	2	5 4 3 2 1
 	3	5 4 3 2 1
 	4	5 4 3 2 1
 	5	5 4 3 2 1
 */
public class AS5 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 5; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
