
/*
 12. Sum of odd elements in array 
 Write a program to find the sum of all odd elements present in an array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print sum of all odd elements in an array. 
 
 Sample Input: 5
 1 4 6 3 10 
 Sample Output: 4
 */
import java.util.Scanner;

public class Ques_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("Sum of odd number is : " + sum);
		scan.close();
	}

}
