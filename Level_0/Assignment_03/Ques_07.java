
/*
 Ques_7. First n multiples of 3 
 Write a program to print first N multiples of 3. 
 Input Format: First line consists of a positive integer n
 Output Format: Print the required space separated number series 
 Sample Input: 7
 Sample Output: 3 6 9 12 15 18 21
 */
import java.util.*;

public class Ques_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			int mul = i * 3;
			System.out.print(mul + " ");
		}

	}

}
