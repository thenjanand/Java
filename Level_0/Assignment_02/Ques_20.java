
/*
 Ques_20.Smallest Number 
 Write a program to find the smallest number among 2 integer numbers 
 
 Input Format: 
 First line contains the first integer n. 
 Second line contains a second integer m. 
 
 Output Format: Print smallest number of 2 numbers 
 
 Sample Input: 10 30
 Sample Output: 10
 */
import java.util.Scanner;

public class Ques_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		if (n < m) {
			System.out.println(n + " is the smallest");
		} else {
			System.out.println(m + " is the smallest");
		}

	}

}
