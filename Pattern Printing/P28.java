/*
 Print below pattern in java
 1 1 1 1 1 2
 3 2 2 2 2 3
 3 3 3 3 3 4
 5 4 4 4 4 4
 5 5 5 5 5 6
 */
public class P28 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				System.out.print(i + 1 + " ");
			}
			for (j = 1; j <= 5; j++) {
				System.out.print(i + " ");
			}

			if (i % 2 != 0) {
				System.out.print(i + 1 + " ");

			}
			System.out.println();

		}
	}

}
