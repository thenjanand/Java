/*
 	Print below Pattern
 	 	    1
 	      1  2
 	    1     3
 	  1        4
 	1  2  3  4  5
 
 */
public class P17 {

	public static void main(String[] args) {

		int n = 5, i, j, k;
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

}
