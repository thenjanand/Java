/*
 	Print below pattern
 	1
 	1 2 3
 	1 2 3 4 5
 	1 2 3 4 5 6 7
 	1 2 3 4 5 6 7 8 9
 */

public class P24 {

	public static void main(String[] args) {
		int i, j, n = 5;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= (2 * i) - 1; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
