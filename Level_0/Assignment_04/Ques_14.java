
/*
 9. Least Common Multiple 
 Write a program to print least common multiple of 2 numbers 
 
 Input Format: First line contains space separated 2 integer input a,b. 
 Output Format: Print least common multiple of a and b. 
 
 Sample Input: 8 12 
 Sample Output:24
 */
import java.util.Scanner;

public class Ques_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				count = i;
			}

		}
		int lcm = (a * b) / count;
		System.out.println("lcm is : " + lcm);

	}

}
