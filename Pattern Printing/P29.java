/*
  Print below Pattern
  1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5
  4 4 4 4
  3 3 3
  2 2
  1
 */
public class P29 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (i = 4; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
