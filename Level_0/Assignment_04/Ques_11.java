
/*
 Ques_11. Lowest Common Factor 
 Write a program to find the lowest common factor of given 2 integers. 
 
 Input Format: First line contains space separated three integer input n,m. 
 Output Format:Print lowest common factor of 2 numbers. 
 
 Sample Input: 10 20 
 Sample Output: 1
 */
import java.util.Scanner;

public class Ques_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		int count = 0;
		for (int i = n; i >= 1; i--) {
			if (n % i == 0 && m % i == 0) {
				count = i;
			}
		}
		System.out.print(count + " ");
	}

}
