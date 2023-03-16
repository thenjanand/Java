
/*
 Ques_5. Farenheit to Celcius 
 Write a program to convert celsius to fahrenheit 
 
 Formula : Celsius = ((Fahrenheit-32)*5)/9 
 
 Input Format: First Line contain single integer m 
 Output Format: Print the value after converting fahrenheit to celsius, the result should restrict to 4 decimal places 
 
 Sample Input: 56
 Sample Output: 13.0000
 */
import java.util.Scanner;

public class Ques_05 {

	public static void main(String[] args) {
		System.out.print("Enter the value in Fahrenheit : ");
		Scanner scan = new Scanner(System.in);
		float Fahrenheit = scan.nextFloat();
		float celsuis = ((Fahrenheit - 32) * 5) / 9;
		System.out.printf("Celsuis : %.4fC", celsuis);

	}

}
