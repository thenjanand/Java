/*
 Ques_1 : Adding Two Numbers
 Write a program to add two integer numbers
 
 Input Format :
 First line contains single integer 'm' 
 Second line contains single integer 'n'
 
 Output Format :
 Print sum of both the integer m and n
 
 Sample Input: 5 10
 Sample Output: 15
 */

import java.util.Scanner;

public class Ques_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of m and n to ADD :");
		int m = scan.nextInt();
		int n = scan.nextInt();
		System.out.println("Result = " + (m + n));
	}

}
