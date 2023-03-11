/*
 	Assignment 2
 	Print pattern below
 	
 		1 2 3 4 5
 	
 	1	1 1 1 1 1
 	2	1 2 1 1 1
 	3	1 2 3 1 1
 	4	1 2 3 4 1
 	5	1 2 3 4 5
 */
public class AS2 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(j + " ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
