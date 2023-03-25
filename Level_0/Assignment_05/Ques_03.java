
/*
 3. Numbers in array reverse order 
 Write a program to print numbers present in each index in an array in reverse order 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print space separated integer values stored in each index in the array in reverse order. 
 
 Sample Input: 5
 1 4 6 3 10 
 Sample Output:
10 3 6 4 1
 */
import java.util.Scanner;

public class Ques_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		scan.close();
	}

}
