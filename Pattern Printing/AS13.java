/*
 	Assignment 10
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	A 
 	2   B B   
 	3	C C C   
 	4   D D D D
 	5	E E E E
 */
public class AS13 {

	public static void main(String[] args) {
		int i, j, k;
		int ch1 = 'A';
		int ch2 = 'E';

		for (i = ch1; i <= ch2; i++) {
			for (j = ch1; j <= i; j++) {
				System.out.print((char) i + " ");
			}
			System.out.println();
		}

	}

}
