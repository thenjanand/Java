/*
 	Assignment 6
 	Print pattern below
 	
 	  C 1 2 3 4 5 6
 	R
 	1	1 0 1 0 1 0
 	2   0 1 0 1 0 1
 	3	1 0 1 0 1 0
 	4   0 1 0 1 0 1
 	5	1 0 1 0 1 0
 */
public class AS6 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++)
		{
			if (i % 2 != 0) {

				for (j = 1; j <= 6; j++) {

					if (i % 2 != 0 && j % 2 != 0) 
					{
						System.out.print("1 ");
					} 
					else 
					{
						System.out.print("0 ");
					}

				}

			} 
			else 
			{
				for (j = 1; j <= 6; j++) 
				{
					if (i % 2 == 0 && j % 2 == 0) 
					{
						System.out.print("1 ");
					} 
					else 
					{
						System.out.print("0 ");
					}
				}
			}

			System.out.println();
		}

	}

}
