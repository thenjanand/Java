/*
 	Assignment 10
 	Print pattern below
 	
 	  C 1 2 3 4 5
 	R
 	1	E D C B A
 	2   E D C B  
 	3	E D C   
 	4   E D  
 	5	E 
 */
public class AS12 {

	public static void main(String[] args) {
		int i, j;
		int char1 = 'A';
		int char2 = 'E';
		for (i = char1; i <= char2; i++) {
			for (j = char2; j >= i; j--) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	}

}
