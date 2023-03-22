
/*
 Ques_1. Reminder of 2 numbers 
 Write a program to find remainder of two given numbers 
 
 Input Format: First line contains space separated two integer input n,m. 
 Output Format: Print reminder of 2 numbers if n>m else print -1 
 
 Sample Input: 20 6 
 Sample Output: 2
 
 Sample Input: 10 20 
 Sample Output: -1
 */
import java.util.Scanner;

public class Ques_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		if (n > m) {
			System.out.println(n % m);
		} else {
			System.out.println(-1);
		}

	}

}
