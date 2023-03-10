/*
 	Print below pattern
 	A			1
 	C B			3 2
 	D E F		4 5 6 
 	J I H G		10 9 8 7
 	K L M N O	11 12 13 14 15
 */
public class P35 {

	public static void main(String[] args) {
		int i, j;
		char ch = 'A';
		for (i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				char chrev = (char) (ch + i - 1);
				for (j = 1; j <= i; j++) {
					System.out.print(chrev-- + " ");
					ch++;
				}
				System.out.println();

			} else {
				for (j = 1; j <= i; j++) {
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();

			}
		}

	}

}
