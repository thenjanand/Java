
/*
 9. Odd numbers in Array in Reverse Order 
 Write a program to print odd numbers present in an array in reverse order. 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print space separated odd integer values stored in an array in reverse order. 
 Sample Input: 5
 1 4 6 3 10 
 Sample Output:3 1
 */
import java.util.Scanner;

public class Ques_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		scan.close();
	}
}