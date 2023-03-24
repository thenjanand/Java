
/*
 Ques13. Common Multiples 
 Write a program to print common multiples of 2 numbers. 
 
 Input Format: 
 First line contains a single integer input n. 
 Second line contains space separated 2 integer input a,b.
 
Output Format: Print first n common multiples of a and b. 

Sample Input: 
9
3 4 
Sample Output:12 24 36 48 60 72 84 96 108
 */
import java.util.Scanner;

public class Ques_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		for (int i = 1; i <= n; i++) {
			System.out.print((a * b) * i + " ");
		}

	}

}
