public class swap {

  public static void swapping(int a,int b)
  {
    int temp= a;
    a=b;
    b=temp;
    System.out.println("a = "+a);
    System.out.println("b= "+b);
  }
  public static void main(String[] args) {
    int a=5;
    int b=10;
    swapping(a,b);
    System.out.println("a = "+a);
    System.out.println("b= "+b);
  }
  
}
