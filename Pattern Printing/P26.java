/*
 	Print below pattern
 	1
 	1 2 1
 	1 2 3 2 1
 	1 2 3 4 3 2 1
 	1 2 3 4 5 4 3 2 1
 */
public class P26 {

	public static void main(String[] args) {
		int i, j, n = 5;
		for (i = 1; i <= n; i++) {
			int count = 1;
			for (j = 1; j <= (2 * i) - 1; j++) {
				if (j < i) {
					System.out.print(count++ + " ");
				} else {
					System.out.print(count-- + " ");

				}

			}
			System.out.println();
		}

	}

}
