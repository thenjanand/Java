
/*
 18. Even, Odd and Negative elements in an Array 
 Write a program to print negative elements, even elements and odd elements present in an array separately. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 Output Format: 
 First line prints space separated negative elements in an array. 
 Second line prints space separated odd elements in an array. 
 Third line prints space separated even elements in an array. 
 
 Sample Input: 10
1 -4 6 3 -10 24 -50 5 34 45 

Sample Output:
-4 -10 -50
1 3 5 45
6 24 34
 */
import java.util.Scanner;

public class Ques_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int arr[] = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
