
/*
 Ques_9. Common Factors 
 Write a program to find common factors of given 2 integers. 
 
 Input Format: First line contains space separated three integer input n,m. 
 Output Format:Print space separated common factors of 2 numbers. 
 
 Sample Input: 10 20 
 Sample Output: 1 2 5 10
 */
import java.util.Scanner;

public class Ques_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && m % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
