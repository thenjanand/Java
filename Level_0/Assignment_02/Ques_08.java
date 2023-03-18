import java.util.Scanner;

/*
 Ques_8. Three Digit Number and a multiple of 10 
 Check if a given number is three digit number and also it is a multiple for 10 
 
 Input Format: First line contains single integer n 
 Output Format: Print Yes if it is three digit number and multiple of 10, else No 
 Sample Input: 145 
 Sample Output: No
 */
public class Ques_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		if (n < 1000 && n > 99 && n % 10 == 0) {
			System.out.print("Yes it is three digit number and multiple of 10");
		} else {
			System.out.print("No");
		}

	}

}
