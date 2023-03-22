
/*
 Ques3. Largest Number 
 Write a program to find the largest number among 4 integer numbers 
 
 Input Format: First line contains space separated three integer input n,m,l,k. 
 Output Format: Print largest number of 4 numbers
 
 Sample Input: 10 25 5 30 
 Sample Output: 30
 */
import java.util.Scanner;

public class Ques_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int k = scan.nextInt();
		scan.close();
		if (n > m && n > l && n > k) {
			System.out.println(n + " is the largest");
		} else if (m > l && m > k) {
			System.out.println(m + " is the largest");
		}

		else if (l > k) {
			System.out.println(l + " is the largest");
		} else {
			System.out.println(k + " is the largest");
		}

	}

}
