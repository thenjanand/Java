
/*
 Ques_17. Positive or Negative Number 
 Check if a given number is greater than 0, if yes then print positive or if the given number is lesser than 0, 
 then print negative. If the given number is exactly equal to 0, then print zero. 
 
 Input Format: First line contains a single integer n. 
 Output Format: Print positive if n>0, else negative if n<0, else zero if n = 0. 
 
 Sample Input: 30
 Sample Output: Positive 
 
 Sample Input: -25 
 Sample Output: Negative 
 
 Sample Input: 0
 Sample Output:Zero
 */
import java.util.Scanner;

public class Ques_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		if (n > 0) {
			System.out.println("Positive");
		} else if (n < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

}
