
/*
 Ques_4. Smallest Number 
 Write a program to find the smallest number among 4 integer numbers 
 
 Input Format: First line contains space separated three integer input n,m,l,k. 
 Output Format: Print smallest number of 4 numbers 
 
 Sample Input: 1 3 5 4 
 Sample Output: 1
 */
import java.util.Scanner;

public class Ques_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int k = scan.nextInt();
		scan.close();
		if (n < m && n < l && n < k) {
			System.out.println(n + " is the smallest");
		} else if (m < l && m < k) {
			System.out.println(m + " is the smallest");
		}

		else if (l < k) {
			System.out.println(l + " is the smallest");
		} else {
			System.out.println(k + " is the smallest");
		}

	}

}
