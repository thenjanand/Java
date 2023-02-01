import java.util.Scanner;

public class whileloop {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ENter the numper to print");
    int num=sc.nextInt();
    int counter=1;

    while(counter<=num){
      System.out.println(counter);
      counter++;
    }
    
  }
  
}
