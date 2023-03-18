import java.util.Scanner;

/*
 6. Two Digit Number Or Not 
 Write a program to check whether the given number is two digit number or not 
 
 Input Format: First line contains single integer n 
 Output Format: Print Yes if it is two digit number, else No 
 Sample Input: 14
 Sample Output: Yes
 */
public class Ques_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		if (n < 100 && n > 9) {
			System.out.print("Yes it is two digit number");
		} else {
			System.out.print("No it is not two digit number");
		}
	}

}
