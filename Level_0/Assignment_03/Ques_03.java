
/*
 Ques_3. First n even numbers 
 Write a program to print the first N even natural numbers.
 Input Format: First line consists of a positive integer n 
 Output Format: Print the number from 1 to n space separated even integer. 

 Sample Input: 5
 Sample Output: 2 4 6 8 10
 */
import java.util.*;

public class Ques_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
