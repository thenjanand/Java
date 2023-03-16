
/*
 Ques4. Multiple Of 5 and 3 
 Write a program to check whether the number is multiple of both 5 and 3. 
 
 Input Format: First line contains single integer n 
 Output Format: Print Yes if it is multiple of 5 and 3, else No 
 
 Sample Input: 15
 Sample Output: Yes
 */
import java.util.*;

public class Ques_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scan.nextInt();
		Check5n3 value = new Check5n3();
		value.multipleOf5n3(number);

	}

}

class Check5n3 {
	void multipleOf5n3(int number) {
		if (number % 5 == 0 && number % 3 == 0) {
			System.out.println(number + " is multiple of 5 and 3");
		} else {
			System.out.println(number + " is not multiple of 5 and 3");
		}
	}
}
