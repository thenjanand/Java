
/*
 22. Swapping Indexes 
 Write a program to swap all the even index elements with odd index elements 
 
 Input Format: First line contains a single integer N.Next line contains N space separated integer values. 
 Output Format: Print the required output 
 
 Sample Input: 6
 1 4 6 3 10 15 
 
 Sample Output:
	Before Swapping
		Even Index elements - 1 6 10
		Odd Index elements - 4 3 15
	After Swapping
		Even Index elements - 4 3 15
		Odd Index elements - 1 6 10
 */
import java.util.*;

public class Ques_22 {

	public static void main(String[] args) {
		int temp = 0;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Before swapping :");
		System.out.print("Even Index Elements : ");
		for (i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd Index Element : ");
		for (i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("After swapping :");
		for (i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
			}
		}
		System.out.print("Even Index Elements : ");
		for (i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd Index Element : ");
		for (i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		scan.close();
	}

}
