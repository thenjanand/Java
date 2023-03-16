
/*
 Ques_2. Multiple Of 5 
 Determine whether the given number is multiple of 5 or not 
 
 Input Format: First line contains single integer n 
 
 Output Format: Print Yes if it is multiple of 5, else No 
 
 Sample Input: 24
 Sample Output: No
 */
import java.util.*;

public class Ques_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scan.nextInt();
		Check value = new Check();
		value.multipleOf5(number);
	}

}

class Check {
	void multipleOf5(int number) {
		if (number % 5 == 0) {
			System.out.println(number + " is multiple of 5");
		} else {
			System.out.println(number + " is not multiple of 5");
		}
	}
}
