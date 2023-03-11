/*
 	Assignment 3
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	1 1 1 1 1
 	2	2 2 1 1 1
 	3	3 3 3 1 1
 	4	4 4 4 4 1
 	5	5 5 5 5 5
 */
public class AS3 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(i + " ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

	}

}
