
/*
 21. Replace even elements in an array 
 Write a program to find the even elements in an array and replace all even elements with ‘0’. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print the required output 
 
 Sample Input: 5
 1 4 65 34 15 
 Sample Output:
 1 0 65 0 15
 */
import java.util.Scanner;

public class Ques_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] % 2 == 0) {
				arr[i] = 0;
			}
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}

}
