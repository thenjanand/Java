
/*
 4. Numbers in Even index of an Array 
 Write a program to print numbers present in the even index of an array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print space separated integer values stored in the even index of the array. 
 Sample Input:5
 1 4 6 3 10 
 Sample Output: 1 6 10
 */
import java.util.Scanner;

public class Ques_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}

		}

		scan.close();
	}

}
