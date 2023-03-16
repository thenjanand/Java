
/*
 Ques_4. Celcius to Farenheit 
 Write a program to convert celsius to fahrenheit 
 
 Formula : fahrenheit= ((celsius*9)/5)+32 
 
 Input Format: 
 First Line contain single integer m 
 
 Output Format: Print the value after converting celsius to fahrenheit 
 
 Sample Input: 12
 Sample Output: 53.6
 */
import java.util.Scanner;

public class Ques_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value in Celsuis : ");
		float celsuis = scan.nextFloat();
		float fahrenheit = ((celsuis * 9) / 5) + 32;
		System.out.println("Fahrenheit : " + fahrenheit);

	}

}
