/*
 	Assignment 8
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	1 0 0 0 0
 	2   0 2 0 0 0
 	3	0 0 3 0 0
 	4   0 0 0 4 0
 	5	0 0 0 0 5
 */
public class AS8 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (j == i) {
					System.out.print(i + " ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
