
/*
 16. Absolute Sum of elements in array 
 Write a program to find the absolute sum of all elements present in an array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print sum of all elements in an array. 
 
 Sample Input: 6
 1 -4 -6 3 10 -20 
 Sample Output:
 16
 */
import java.util.Scanner;

public class Ques_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println(Math.abs(sum));
		scan.close();
	}

}
