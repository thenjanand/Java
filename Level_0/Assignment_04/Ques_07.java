
/*
 Ques_7. Count factors of number 
 Write a program to count factors of given number 
 
 Input Format: First line consists of a positive integer n 
 Output Format:Print the integer count. 
 
 Sample Input: 20
 Sample Output: 6
 */
import java.util.Scanner;

public class Ques_07 {

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
		System.out.print(count + " ");
	}

}
