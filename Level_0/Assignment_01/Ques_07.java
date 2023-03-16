
/*
 Ques_7. Circle Area 
 Write a program to find the area of the circle. 
 
 Formula: area = pi*r*r 
 Consider pi = 3.142 
 Input Format: First line contains an Integer, radius of a circle 
 Output Format: Give the area of the circle. The area of the circle should have four decimal places only. 
 Sample Input: 18
 Sample Output:1018.0080
 */
import java.util.*;

public class Ques_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		int radius = scan.nextInt();
		final float PI = 3.14f;

		float area = (float) (PI * Math.floor(radius * radius));
		System.out.printf("Area of Cylinder is : %.4f", area);
	}

}
