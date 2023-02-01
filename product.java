/*Product of a number using function */
public class product {

  public static int multiply(int a,int b)
  {
    int product = a*b;
    return product;
  }
  
  public static void main(String[] args) {
    int a= 3;
    int b=5;
    int product =multiply(a, b);
    System.out.println("Product :"+product);
  }
}
