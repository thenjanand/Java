import java.util.Scanner;

/*
 9. Largest Number 
 Write a program to print the largest number among 2 integer numbers 
 
 Input Format: First line contains the first integer n. 
 Second line contains a second integer m. 
 
 Output Format: Print largest number of 2 numbers 
 
 Sample Input:10 30 
 Sample Output: 30
 */
import java.util.*;

public class Ques_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		if (n > m) {
			System.out.println(n + " is the largest");
		} else {
			System.out.println(m + " is the largest");
		}

	}

}
