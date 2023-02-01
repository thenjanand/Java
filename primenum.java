import java.util.*;

public class primenum {
  public static void main(String[] args) {
    System.out.println("Enter the number :");
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    boolean isPrime=true;
if(num==2){
System.out.println(num+ "is prime");
}
else{
    for(int i=2;i<Math.sqrt(num);i++){
      if(num%i==0){
        isPrime=false;
      }
      }
     if(isPrime==true)
     System.out.println(num+"is prime");
     else
     System.out.println(num+"is not prime");

    }
  }

  }
