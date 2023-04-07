
/*
 13. Elements divisible by 2 and 3 in array 
 Write a program to print the elements which are divisible by 2 and 3 in an array. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: Print elements which are divisible by 2 and 3 in an array
Sample Input: 5
1 4 6 3 10 
Sample Output: 4 6 3 10
 */
import java.util.Scanner;

public class Ques_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if ((arr[i] % 2 == 0) || (arr[i] % 3 == 0)) {
				System.out.print(arr[i]);
			}
		}

		scan.close();
	}

}
