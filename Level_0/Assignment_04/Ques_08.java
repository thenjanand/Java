
/*
 Ques_8. Prime Number 
 Write a program to find whether the given number is a prime number or not. 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print Yes if the number is prime, else print No 
 
 Sample Input: 11
 Sample Output: Yes
 */
import java.util.Scanner;

public class Ques_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		scan.close();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			System.out.println("Yes,Its a Prime number");
		} else {
			System.out.println("No");
		}

	}

}
