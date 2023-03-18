
/*
 Ques_11. ASCII Value of Character 
 Write a program to print the ASCII value of a character. 
 
 Input Format: First line contains single character c 
 Output Format: Print ASCII value of character. 
 
 Sample Input: A
 Sample Output: 65
 */
import java.util.Scanner;

public class Ques_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char c = scan.next().charAt(0);
		int b = (int) c;
		System.out.print("ASCII value of '" + c + "' is " + b);
	}

}
