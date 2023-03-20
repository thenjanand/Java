
/*
 1Ques_22.Smallest Number 
 Write a program to find the smallest number among 3 integer numbers 
 
 Input Format: First line contains space separated three integer input n,m,l. 
 Output Format: Print smallest number of 3 numbers 
 
 Sample Input: 10 25 5 
 Sample Output: 5
 */
import java.util.Scanner;

public class Ques_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		if (n < m && n < l) {
			System.out.println(n + " is the smallest");
		} else if (m < l) {
			System.out.println(m + " is the smallest");
		} else {
			System.out.println(l + " is the smallest");
		}

	}

}
