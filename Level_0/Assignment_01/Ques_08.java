
/*
 Ques_8. Total Surface Area Of Cylinder 
 Write a program to calculate total surface area of a cylinder 
 
 Formula: 2 * pi* r*(r+h) 
 
 Input Format: First line contains an Integer, radius of a cylinder 
 Second line contains an Integer, height of a cylinder Output 
 
 Format: Give the area of the cylinder. The area of the cylinder should have four decimal places only. 
 
 Sample Input: 7 13
 Sample Output: 879.7600
 */
import java.util.*;

public class Ques_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		int radius = scan.nextInt();
		System.out.print("Enter the Height : ");
		int height = scan.nextInt();
		final float PI = 3.14f;

		float area = 2 * PI * radius * (radius + height);
		System.out.printf("Toatl Surface Area of Cylinder is : %.4f", area);
	}

}