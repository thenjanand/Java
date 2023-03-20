
/*
 2. Numbers from n to 1 
 Write a program to print the numbers from N to 1. 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the number from n to 1 space separated integer. 
 
 Sample Input: 10
 Sample Output: 10 9 8 7 6 5 4 3 2 1
 */
import java.util.*;

public class Ques_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		for (int i = n; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

}
