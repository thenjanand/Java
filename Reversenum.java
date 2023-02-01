import java.util.Scanner;

public class Reversenum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lastdigit=0;
    int num=sc.nextInt();
    int reverse=0;
    /* 
     while(num>0){
      lastdigit=num%10;//
      System.out.print(lastdigit);
      num/=10;// for reducing the number
     }
     */
    while(num>0){
      lastdigit=num%10;
      reverse=(reverse*10)+lastdigit;
      num/=10;

    }
    System.out.println(reverse);
  }
  
}
