/*
 	Print below pattern
 	1
 	2  3
 	4  5  6
 	7  8  9  10
 	11 12 13 14 15
 */
public class P30 {

	public static void main(String[] args) {
		int i, j, count = 0;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				count++;
				if (count < 10) {
					System.out.print(count + "  ");
				} else {
					System.out.print(count + " ");
				}
			}
			System.out.println();
		}

	}

}
