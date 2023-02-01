import java.util.Scanner;

public class prime {
  public static boolean isPrime(int n){
    if(n==2){
      return true;
    }
    for(int i=2;i<=n-1;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int range=sc.nextInt();
    for(int i=2;i<=range;i++)
    {
      if(isPrime(i)){
        System.out.print(i+" ");
      }
    }
    System.out.println();
  }
}
