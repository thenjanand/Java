/*
 	Assignment 9
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	        1
 	2         1 2
 	3	    1 2 3
 	4     1 2 3 4
 	5	1 2 3 4 5
 */
public class AS9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (k = 4; k >= i; k--) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
