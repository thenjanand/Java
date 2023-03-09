/*
 Print below pattern
         1
       1 2 1
     1 2 3 2 1
   1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1
 */
public class P27 {

	public static void main(String[] args) {
		int i, j, k, n = 5;

		for (i = 1; i <= 5; i++) {

			for (k = 1; k <= n - i; k++) {
				System.out.print("  ");
			}
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
