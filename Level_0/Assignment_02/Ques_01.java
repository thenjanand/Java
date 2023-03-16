
/*
 Ques_1. Even or Odd 
 Check if a given number is even number or odd number 
 
 Input Format: First line contains single integer n 
 
 Output Format: Print Yes if it is even number, else No 
 
 Sample Input: 12
 Sample Output: Yes
 */
import java.util.*;

public class Ques_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scan.nextInt();
		NumberCheck value = new NumberCheck();
		value.checkEvenOdd(number);
	}
}

class NumberCheck {
	void checkEvenOdd(int number) {

		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}

	}
}
