import java.util.Scanner;

/*
 Ques_12. Equivalent ASCII Character 
 Write a program to print the equivalent ASCII character. 
 
 Input Format: First line contains single integer n 
 Output Format: Print equivalent ASCII character. 
 
 Sample Input: 98
 Sample Output: b
 */
public class Ques_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the ASCII value : ");
		char n = (char) scan.nextInt();
		System.out.print("Equivalent ASCII character is " + n);
	}

}
