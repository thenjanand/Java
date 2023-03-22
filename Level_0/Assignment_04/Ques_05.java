
/*
 Ques5. Swap 2 Numbers 
 Write a program to swap two numbers. 
 
 Input Format: 
 First line consists of a positive integer n1. 
 Second line consists of a positive integer n2. 
 
 Output Format: Prints the required result before and after swapping the numbers. 
 Sample Input: 10 20
 Sample Output: Before Swapping 10 20 After Swapping 20 10
 */
import java.util.Scanner;

public class Ques_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println("Before Swapping : ");
		System.out.println(n1);
		System.out.println(n2);
		scan.close();
		System.out.println("After Swapping : ");
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println(n1);
		System.out.print(n2);
	}

}
