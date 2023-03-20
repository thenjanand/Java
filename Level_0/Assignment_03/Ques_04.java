
/*
 Ques_4. First n odd numbers 
 Write a program to print the first N odd natural numbers. 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the number from 1 to n space separated odd integers. 
 
 Sample Input: 5
 Sample Output: 1 3 5 7 9
 */
import java.util.*;

public class Ques_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}

}
