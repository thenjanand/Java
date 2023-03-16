import java.util.Scanner;

/*
 3. Multiple Of 10 
 Determine whether the given number is multiple of 10 or not 
 
 Input Format: First line contains single integer n 
 Output Format: Print Yes if it is multiple of 10, else No 
 
 Sample Input: 50
 Sample Output: Yes
 */
import java.util.*;

public class Ques_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scan.nextInt();
		Check10 value = new Check10();
		value.multipleOf10(number);

	}

}

class Check10 {
	void multipleOf10(int number) {
		if (number % 10 == 0) {
			System.out.println(number + " is multiple of 10");
		} else {
			System.out.println(number + " is not multiple of 10");
		}
	}
}
