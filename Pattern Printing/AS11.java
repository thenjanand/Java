/*
 	Assignment 10
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	A B C D E
 	2   B C D E  
 	3	C D E   
 	4   D E 
 	5	E 
 */
public class AS11 {

	public static void main(String[] args) {
		int i, j;
		int ch = 'A';
		int ch1 = 'E';
		for (i = ch; i <= ch1; i++) {
			for (j = i; j <= ch1; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
	}

}
