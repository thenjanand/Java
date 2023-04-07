
/*
 14. Sum of elements divisible by 3 and 5 in array 
 Write a program to find the sum of elements which are divisible by 3 and 5 in an array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print sum elements which are divisible by 3 and 5 in an array 
 
 Sample Input: 5
 1 4 6 3 10 
 Sample Output: 13
 */
import java.util.*;

public class Ques_14 {

	public static void main(String[] args) {
		System.out.print("Enter the size of array : ");
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		scan.close();
	}

}
