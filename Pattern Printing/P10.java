/*
  	Print below Pattern
  	
  	1 2 3 4 5
  	2 3 4 5 6
  	3 4 5 6 7
  	4 5 6 7 8
  	5 6 7 8 9
 */
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((i + j) - 1 + " ");
			}
			System.out.println();
		}
	}

}
