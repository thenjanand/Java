
/*
 Ques_8. First n multiples of 5 
 Write a program to print first N multiples of 5. 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the required space separated number series 
 
 Sample Input: 5
 Sample Output: 5 10 15 20 25
 */
import java.util.Scanner;
import java.utli.*;

public class Ques_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			int mul = i * 5;
			System.out.print(mul + " ");
		}

	}

}
