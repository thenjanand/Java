
/*
 10. Sum of elements in array 
 Write a program to find the sum of all elements present in an array. 
 
 Input Format:First line contains a single integer N. Next line contains N space separated integer values. 
Output Format: Print sum of all elements in an array.
 
Sample Input: 5
1 4 6 3 10 
Sample Output:24
 */
import java.util.Scanner;

public class Ques_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("Sum is : " + sum);
		scan.close();
	}
}
