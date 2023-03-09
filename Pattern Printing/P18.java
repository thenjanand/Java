/*
  Print below pattern
  
  1
  1  2
  1   3
  1     4
  1 2 3 4 5
 */
public class P18 {

	public static void main(String[] args) {

		int n = 5, i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n) {
					System.out.print(j + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}

}
