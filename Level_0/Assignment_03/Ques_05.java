
/*
 Ques_5. Multiples of 2 
 Write a program to print all the multiples of 2 till N. 
 
 Input Format: First line consists of a positive integer n
 Output Format: Print the numbers from 2 to n which are multiples of 2. 
 
 Sample Input: 15
 Sample Output: 2 4 6 8 10 12 14
 */
import java.util.*;

public class Ques_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			int mul = i * 2;
			if (mul < n) {
				System.out.print(mul + " ");
			}

		}

	}

}
