
/*
 24.Occurance of smallest element 
 Write a program to find the occurrence of the smallest element in an array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print the occurrence of smallest element 
 
 Sample Input: 6
 1 1 6 15 1 15 
 Sample Output: 3
 */
import java.util.*;

public class Ques_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == small)
				count++;
		}
		System.out.println(count);
		scan.close();
	}

}
