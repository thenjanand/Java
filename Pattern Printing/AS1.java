/*
 	Assignment 1
 	Print pattern below
 	
 	1 1 1 1 1
 	1 2 1 1 1
 	1 1 3 1 1
 	1 1 1 4 1
 	1 1 1 1 5
 */
public class AS1 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (j == i) {
					System.out.print(i + " ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

	}

}
