
/*
 15. Sum of positive elements and negative elements 
 Write a program to find the sum of positive elements and negative elements separately in an array. 
 
 Input Format: First line contains a single integer N. 
 Next line contains N space separated integer values.
 
Output Format: First line print sum of positive elements in an array. 
Second line print sum of negative elements in an array. 

Sample Input: 6
1 -4 -6 3 10 -20 

Sample Output: 14
-30
 */
import java.util.Scanner;

public class Ques_15 {

	public static void main(String[] args) {
		int psum = 0, nsum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] < 0) {
				nsum += arr[i];
			}
			if (arr[i] > 0) {
				psum += arr[i];
			}
		}
		System.out.println("Negative Number sum :" + nsum);
		System.out.println("Positive Number sum :" + psum);

		scan.close();
	}

}
