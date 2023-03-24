
/*
 Ques15. Sum of n natural numbers 
 Write a program to find sum of first N natural numbers
 
 Input Format: First line contains a single integer input n
 Output Format: Print sum of n natural numbers 
 
 Sample Input: 100 
 Sample Output:5050
 */
import java.util.Scanner;

public class Ques_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of " + n + " natural number is : " + sum);
	}

}
