public class test {
  public static void main(String[] args)
  {
      int a[] = {1,2,5,4,0};
      int b[] = {2,4,5,0,1};
      boolean result = true;
      if (a.length == b.length) {
          for (int i = 0; i < a.length; i = i + 1) {
              if (a[i] != b[i]) {
                  result = false;
              }
          }
      }
      else {
          result = false;
      }
      if (result == true) {
          System.out.println("true");
      }
      else {
          System.out.println("false");
      }
  }
}