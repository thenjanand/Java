
/*
 Ques_14. Uppercase ASCII value or not 
 Check if a given number is the ASCII value of uppercase alphabet or not. 
 
 Input Format: First line contains a single integer n. 
 Output Format: Print Yes if number is ASCII value of uppercase else No 
 
 Sample Input: 78
 Sample Output: Yes
 */
import java.util.Scanner;

public class Ques_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the ASCII value : ");
		int c = scan.nextInt();
		if (c >= 65 && c <= 90) {
			System.out.print((char) c + " is ASCII value of Uppercase");
		} else {
			System.out.print("No");
		}

	}

}
