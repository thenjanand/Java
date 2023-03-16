import java.util.Scanner;

/*
 9. Perimeter Of a Rectangle 
 write a program to find the perimeter of the rectangle 
 
 Formula: area = 2(length + width) 
 
 Input Format: 
 First line contains an Integer, length of a rectangle 
 Second line contains an Integer, represents breadth of a rectangle 
 
 Output Format: Gives perimeter of the rectangle 
 
 Sample Input: 2 4
 Sample Output: 12
 */
import java.util.*;

public class Ques_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of rectangle : ");
		int length = scan.nextInt();
		System.out.print("Enter the breadth of rectangle : ");
		int breadth = scan.nextInt();

		int perimeter = 2 * (length + breadth);
		System.out.println("Permimeter of rectangle is : " + perimeter);
	}

}
