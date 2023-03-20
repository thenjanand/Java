
/*
 Ques_18. Absolute value 
 Write a program to find the absolute value of a given integer. 
 
 Input Format: First line contains a single integer n. 
 Output Format: Print absolute value of integer. 
 
 Sample Input: -5
 Sample Output: 5
 
 Sample Input: 12
 Sample Output: 12
 */
import java.util.Scanner;

public class Ques_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		System.out.println(Math.abs(n));

	}

}
