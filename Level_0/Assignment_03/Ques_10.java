
/*
 Ques_10. First N Multiple of 2, 5 and 7 
 Write a program to print all the numbers which are multiples of either 2 or 5 or 7. 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the number from 2 to n space separated multiples of 2 and 3 integers. 
 
 Sample Input: 15
 Sample Output: 2 4 5 6 7 8 10 12 14 15
 */
import java.util.*;

public class Ques_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0 || i % 5 == 0 || i % 7 == 0) {
				System.out.print(i + " ");
			}

		}

	}

}
