import java.util.Scanner;

public class incomeTax {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int income = sc.nextInt();
     int tax;

     if (income<500000){
      tax=0;
      System.out.println("Tax is " +tax);
     }

    else if (income>=500000 && income<1000000){
        tax=(int)(0.2*income);
        System.out.println("Tax is " +tax);
    }

    else{
          tax=(int)(0.3*income);
          System.out.println("Tax is " +tax);
     }
      
    
  }
  
}
