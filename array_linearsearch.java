/*Linear search */
import java.util.*;

public class array_linearsearch {
  public static void main(String[] args) {
    int arr[] = new int[5];
    int i;
    int num;
    int count=0;
    System.out.println("Enter 5 number in array  : ");
    Scanner sc = new Scanner(System.in);
    for (i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("here is the list of array :");
    for (i = 0; i < 5; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("Enter a number to be searched : ");
    num = sc.nextInt();
    for (i = 0; i < 5; i++) {
      if (num == arr[i]) {
        count++;
      }
    }
    if(count==1)
    System.out.println(num+"is present");
    else
    System.out.println(num+"is not present");
  }
}
