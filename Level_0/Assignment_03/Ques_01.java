
/*
 Ques_1. First n numbers 
 Write a program to print the first N natural numbers. 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the number from 1 to n space separated integer. 
 
 Sample Input: 10
 Sample Output: 1 2 3 4 5 6 7 8 9 10
 */
import java.util.*;

public class Ques_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}

	}

}
