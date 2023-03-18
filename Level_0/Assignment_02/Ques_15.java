
/*
 Ques_15. Number ASCII value or not 
 Check if a given number is the ASCII value of the numeric character or not. 
 
 Input Format: First line contains a single integer n. 
 Output Format: Print Yes if number is ASCII value of number else No 
 
 Sample Input: 50
 Sample Output: Yes
 */
import java.util.Scanner;

public class Ques_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the ASCII value : ");
		int c = scan.nextInt();
		if (c >= 48 && c <= 57) {
			System.out.print((char) c + " is ASCII code of Number");
		} else {
			System.out.print("No");
		}
	}

}
