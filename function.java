import java.util.Scanner;

public class function {
  public static int calculateSum(int a,int b)//parameters or formal parameters
  {
    int sum=a+b;
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int sum=calculateSum(num1, num2);//arguments or actual parameters
    System.out.println("the sum is "+sum);
    
  }
  
}
