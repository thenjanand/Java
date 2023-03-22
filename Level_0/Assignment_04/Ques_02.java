
/*
 2. Grading System. 
 Write a program to find grade of the student marks 
 
 ● If marks scored 90+ then print A+. 
 ● If marks scored 80+ then print A. 
 ● If marks scored 70+ then print B+. 
 ● If marks scored 60+ then print B. 
 ● If marks scored 50+ then print C+. 
 ● If marks scored 40+ then print C. 
 ● If marks scored less than 40 then print “Fail”. 
 ● If marks scored is less than 0 or greater than 100 then print “Invaild”.
 
 Input Format: First line contains a single integer input n. 
 Output Format: Print its respective grade as per the n input 
 
 Sample Input: 83
 Sample Output: A
 
 Sample Input: 9
 Sample Output: Invaild 
 
 Sample Input: 38
 Sample Output: Fail
 */
import java.util.Scanner;

public class Ques_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		scan.close();
		if (n > 100 || n < 0) {
			System.out.println("Invalid");
		} else if (n >= 90) {
			System.out.println("A+");
		} else if (n >= 80) {
			System.out.println("A");
		} else if (n >= 70) {
			System.out.println("B+");
		} else if (n >= 60) {
			System.out.println("B");
		} else if (n >= 50) {
			System.out.println("C+");
		} else if (n >= 40) {
			System.out.println("C");
		} else {
			System.out.println("Fail");
		}

	}

}
