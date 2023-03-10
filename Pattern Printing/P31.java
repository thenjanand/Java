/*
 	Print pattern below
 	1
 	3 * 2
 	6 * 5 * 4
 	10 * 9 * 8 * 7
 	15 * 14 * 13 * 12 * 11
 */
public class P31 {

	public static void main(String[] args) {
		int i, j, count;
		for (i = 1; i <= 5; i++) {
			count = i * (i + 1) / 2;
			for (j = 1; j <= i; j++) {

				System.out.print(count-- + " ");
				if (j < i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
