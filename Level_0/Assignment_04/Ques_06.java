
/*
 Ques_6. Factors of number 
 Write a program to find factors of given number 
 
 Input Format: First line consists of a positive integer n 
 Output Format: Print the space separated integer factors of given number 
 
 Sample Input: 20
 Sample Output: 1 2 4 5 10 20
 */
import java.util.Scanner;

public class Ques_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		scan.close();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
