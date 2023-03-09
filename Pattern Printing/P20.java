/*
 Print pattern below
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */
public class P20 {

	public static void main(String[] args) {
		int n = 5, i, j;
		for (i = 0; i < n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
