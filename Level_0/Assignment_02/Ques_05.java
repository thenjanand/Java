/*
 5. Multiple Of 5, 3 and 7 
 Write a program to check whether the number is multiple of 5, 3 and 7. 
 
 Input Format: First line contains single integer n 
 Output Format: Print Yes if it is multiple of 5, 3 and 7, else No 
 
 Sample Input: 14
 Sample Output: No
 */

import java.util.*;

public class Ques_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
			System.out.print(n + "is multiple of 3 ,5 and 7");
		} else {
			System.out.print("No," + n + " is not multiple of 3 ,5 and 7.");
		}
	}

}
