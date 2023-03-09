/*
 * 			Print below patter
 * 			1 2 3 4 5
 			2     5
 			3   5
 			4 5
 			5
 */
public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n = 5;
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++) {
				if (i == 1 || j == i || j == n) {
					System.out.print(j + " ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
