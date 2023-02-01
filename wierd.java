import java.util.*;
public class wierd {

  public static <K> K doSOmething(K k){
System.out.println("do something");
return k;
  }
  public static void main(String[] args) {
   //doSOmething(1);
    System.out.println(doSOmething(1));
  }
  
}
