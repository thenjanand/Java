
/*
 Ques_11. First N Multiple of 3, 5 and 7 
 Write a program to print the first N multiples of either 3 or 5 or 7.
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the number from 2 to n space separated multiples of 3, 5 and 7 integers. 
 
 Sample Input: 10
 Sample Output: 3 5 6 7 9 10 12 14 15 18
 */
import java.util.Scanner;

public class Ques_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int count = 0;
		for (int i = 1; count < n; i++) {
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				System.out.print(i + " ");
				count++;
			}

		}

	}

}
