
/*
 19. Largest element in an array 
 Write a program to find the largest element in a given array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print largest element in an array 
 
 Sample Input: 5
 1 4 65 3 10 
 Sample Output:
 65
 */
import java.util.Scanner;

public class Ques_19 {

	public static void main(String[] args) {
		int temp;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int large = 0;
		for (int i = 0; i < arr.length; i++) {
			if (large < arr[i]) {
				large = arr[i];
			}

		}
		System.out.print(large);

	}

}
