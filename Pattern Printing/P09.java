/*
 * 	Print Below Pattern
 	
 	01 02 03 04 05
 	02 04 06 08 10
 	03 06 09 12 15
 	04 08 12 16 20
 	05 10 15 20 25
 */
public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i * j < 10)
					System.out.print("0" + i * j + " ");
				else
					System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

}
