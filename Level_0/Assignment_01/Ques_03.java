
/*
 Ques_3 : Sum of combination of three numbers 
 
 Write a program to print all sum combination of three numbers by taking two numbers at a time 
 
 Input Format: 
 First Line contain single integer m 
 Second line contain single integer n 
 Third line contain single integer k 
 
 Output Format: Print all sum combination of three numbers 
 
 Sample Input: 2 4 6
 Sample Output: 6 8 10
 
 Explanation: 
 2 + 4 = 6 
 2 + 6 = 8 
 4 + 6 = 10
 
 */
import java.util.Scanner;

public class Ques_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :");
		int m = scan.nextInt();
		int n = scan.nextInt();
		int k = scan.nextInt();

		System.out.println(m + " + " + n + " = " + (m + n));
		System.out.println(m + " + " + k + " = " + (m + k));
		System.out.println(n + " + " + k + " = " + (n + k));

	}

}
