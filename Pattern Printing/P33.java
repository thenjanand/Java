/*
 Print below pattern
 A
 A B
 A B C
 A B C D
 A B C D E
 */
public class P33 {

	public static void main(String[] args) {
		int i, j;

		for (i = 1; i <= 5; i++) {
			char ch = 'A';
			for (j = 1; j <= i; j++) {
				System.out.print(ch++);
			}
			System.out.println();

		}

	}

}
