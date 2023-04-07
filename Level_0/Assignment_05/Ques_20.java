
/*
 20. Smallest element in an array 
 Write a program to find the smallest element in a given array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values.
 Output Format:Print smallest element in an array 
 
 Sample Input: 5
 1 4 65 3 10 
 Sample Output: 1
 */
import java.util.Scanner;

public class Ques_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("ENter the size of array : ");
		int arr[] = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println(small);
		scan.close();
	}

}
