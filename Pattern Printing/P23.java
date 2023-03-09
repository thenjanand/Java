/*
 	Print below pattern
 	*
 	* * *
 	* * * * *
 	* * * * * * *
 	* * * * * * * * *
 */
public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n = 5;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= (2*i)-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
