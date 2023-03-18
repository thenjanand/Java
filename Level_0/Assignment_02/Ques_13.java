
/*
 Ques_13. Lowercase ASCII value or not 
 Check if a given number is the ASCII value of lowercase alphabet or not. 
 
 Input Format: First line contains a single integer n. 
 Output Format: Print Yes if number is ASCII value of lowercase else No 
 
 Sample Input: 100 
 Sample Output: Yes
 */
import java.util.Scanner;

public class Ques_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the ASCII value : ");
		int c = scan.nextInt();
		if (c > 96 && c < 123) {
			System.out.print((char) c + " is ASCII value of lowercase");
		} else {
			System.out.print("No");
		}
	}

}
