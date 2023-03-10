/*
 * Print below Pattern
 	A
 	B C
 	D E F
 	G H I J
 	K L M N O
 */
public class P34 {

	public static void main(String[] args) {
		int i, j;
		char ch = 'A';
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

	}

}
