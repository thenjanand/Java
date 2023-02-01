public class factorial {
   public static int fact(int n)
   {
    int f=1;
    for(int i=1;i<=n;i++)
    {
      f=f*i;
    }
    return f;
   }
   public static void main(String[] args) 
   {
    int f=4;
    System.out.println("the factorial of "+f+" = "+fact(f));
   }
}
