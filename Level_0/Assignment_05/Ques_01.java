
/*
 1. Take input from user and to store in array 
 Write a program to take input from the user and store it in an array using Scanner Class. 
 
 Input Format: First line contains a single integer N. Next line contains N space separated integer values. 
 
 Sample Input: 5
 Sample Output : 1 2 3 4 5
 */
import java.util.Scanner;

public class Ques_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENter the length of array : ");
		int size = scan.nextInt();
		int n[] = new int[size];
		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		scan.close();
	}

}
