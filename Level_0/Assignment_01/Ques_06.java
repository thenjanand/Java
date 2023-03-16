
/*
 Ques_6. Perimeter Of a Square 
 write a program to find the perimeter of the square 
 
 Formula: Perimeter = 4 * side 
 
 Input Format: First line contains an Integer, side of a square 
 
 Output Format: Gives perimeter of the square 
 
 Sample Input: 6
 Sample Output: 24
 */
import java.util.*;

public class Ques_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side of a square : ");
		int side = scan.nextInt();
		int perimeter = 4 * side;
		System.out.println("Perimeter : " + perimeter);
	}

}
