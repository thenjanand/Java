
/*
 Ques_6. First n multiples of 2 
 Write a program to print first n multiples of 2. 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the required space separated number series 
 
 Sample Input: 10
 Sample Output: 2 4 6 8 10 12 14 16 18 20
 */
import java.util.Scanner;

public class Ques_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			int mul = i * 2;
			System.out.print(mul + " ");
		}

	}

}
