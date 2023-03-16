
/*
 10. Convert Dollars to Rupees 
 Write a program to convert Dollars to rupees 
 
 Input Format: First line contains single integer representing dollar 
 Output Format: Print result after converting dollar to rupees 
 
 Sample Input: 1000 
 Sample Output: 61060.0
 */
import java.util.*;

public class Ques_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount in dollor $ : ");
		int dollor = scan.nextInt();
		float rupeesValue = 61.06f;
		float value = dollor * rupeesValue;
		System.out.println("In Rupees : " + value);
	}

}
