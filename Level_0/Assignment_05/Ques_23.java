
/*
 23.Occurrence of Largest element 
 Write a program to find the occurrence of the largest element in an array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print the occurrence of largest element 
 Sample Input: 6
1 4 6 15 10 15 
Sample Output: 2
 */
import java.util.*;

public class Ques_23 {

	public static void main(String[] args) {
		int large = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == large) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}

}
