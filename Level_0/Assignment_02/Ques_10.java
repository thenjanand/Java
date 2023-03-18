import java.util.Scanner;

/*
 Ques_10. Number ends with zero or not 
 Write a program to Check if a given number ends with zero or not 
 
 Input Format: First line contains single integer n 
 Output Format: Print Yes if number ends with zero else No 
 
 Sample Input: 140 
 Sample Output: Yes
 */
public class Ques_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		if (n % 10 == 0) {
			System.out.print("Number ends with Zero");
		} else {
			System.out.print("Number doesn't ends with Zero");
		}

	}

}
