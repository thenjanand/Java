
/*
 17. Average of elements in array
Write a program to find the average of all elements present in an array. 

Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
Output Format: Print float value of average of all elements in an array. 

Sample Input: 5
1 4 6 3 10 
Sample Output:
4.8
 */
import java.util.Scanner;

public class Ques_17 {

	public static void main(String[] args) {
		float sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println("Average : " + sum / arr.length);
		scan.close();
	}

}
