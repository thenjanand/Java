import java.util.Scanner;

/*
 Ques7. Three Digit Number Or Not 
 
 Write a program to check whether the given number is three digit number or not 
 
 Input Format: First line contains single integer n 
 Output Format: Print Yes if it is three digit number, else No 
 
 Sample Input: 145 
 Sample Output: Yes
 */
public class Ques_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		if (n < 1000 && n > 99) {
			System.out.print("Yes it is three digit number");
		} else {
			System.out.print("No it is not three digit number");
		}
	}

}
