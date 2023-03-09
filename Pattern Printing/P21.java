/*
 	Print below pattern
 	
 	1 2 3 4 5
 	2 3 4 5
 	3 4 5
 	4 5
 	5
 */
public class P21 {
	public static void main(String[] args) {
		int i, j, n = 5;
		for (i = 1; i <= n; i++) {

			for (j = i; j <= n; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
