
/*
 Ques_16. Game of multiplication and addition 
 Write a program to check the given 2 integer input is even if yes then find product of 2 numbers else find the sum of 2 numbers. 
 
 Input Format: 
 First line contains the first integer n. 
 Second line contains a second integer m. 
 
 Output Format: Print product of 2 numbers if both numbers are even else sum 
 
 Sample Input: 10 20
 Sample Output: 200
 */
import java.util.Scanner;

public class Ques_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the values : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		if (n % 2 == 0 && m % 2 == 0) {
			System.out.println("Product of " + n + " and " + m + " is " + m * n);
		} else {
			System.out.println("Sum of " + n + " and " + m + " is " + (m + n));
		}

	}

}
