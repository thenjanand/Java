/*
 Print below pattern
 A
 B B
 C C C
 D D D D
 E E E E E
 */
public class P32 {

	public static void main(String[] args) {
		int i, j;
		char ch = 'A';
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(ch + " ");

			}

			System.out.println();
			ch++;
		}

	}

}
