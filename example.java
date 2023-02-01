import java.util.*;
class example
{  
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter the number");
    int n = sc.nextInt ();
    if (n % 23 == 0)
      {System.out.print ("Foo");
  }
    if (n % 41 == 0)
      {
	System.out.print ("Baar");
      }

   if (n % 23 == 0 && n % 41 == 0)
      {
	System.out.print ("Foo Bar");
      }
  }
}