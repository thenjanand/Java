
/*
 Ques_12. Lowest Common Factor Excluding 1 and 2 
 Write a program to find the lowest common factor of given 2 integers. 
 
 Input Format: First line contains space separated three integer input n,m. 
 Output Format: Print lowest common factor of 2 numbers excluding 1 and 2 
 
 Sample Input: 10 20 
 Sample Output: 5
 */
import java.util.Scanner;

public class Ques_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		int count = 0;
		for (int i = n; i > 2; i--) {
			if (n % i == 0 && m % i == 0) {
				count = i;
			}
		}
		System.out.print(count + " ");
	}

}
