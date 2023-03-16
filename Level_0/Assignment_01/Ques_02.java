
/*
Ques_2:Adding Three Numbers 
Write a program to add three integer numbers 

Input Format: 
First Line contain single integer m 
Second line contain single integer n 
Third line contain single integer k 

Output Format: Print sum of both the integers m, n and k 

Sample Input: 5 10 5

Sample Output: 20
 */
import java.util.Scanner;

public class Ques_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value to m,n and k to add :");
		int m = scan.nextInt();
		int n = scan.nextInt();
		int k = scan.nextInt();
		System.out.println("Result =" + (m + n + k));
	}

}
