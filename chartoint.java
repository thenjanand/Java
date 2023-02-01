import java.util.Scanner;

//how to find factorial in java?
public class chartoint {
  public static void main(String[] args) {
  /*   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character : ");
    String st = sc.next();
    char first=st.charAt(0);
    int asci = (int)first;

    System.out.println(first+" "+asci);
    first++;
    asci++;
    System.out.println(first+" "+asci);
    first++;
    asci++;
    System.out.println(first+" "+asci);
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch < 90) {
            ch++;
            System.out.println(ch +" "+(int) ch);
            ch++;
            System.out.println(ch +" "+(int) ch);
        } else if (ch >= 97 && ch < 122) {
            ch++;
            System.out.println(ch +" "+(int) ch);
            ch++;
            System.out.println(ch +" "+(int) ch);
          
        }else if (ch == 90) {
            char nextChar = 'A';
            System.out.println((char) nextChar+" "+(int) nextChar);
            nextChar++;
            System.out.println((char) nextChar+" "+(int) nextChar);
        } else if (ch == 122) {
            char nextChar = 'a';
            System.out.println((char) nextChar+" "+(int) nextChar);
            nextChar++;
            System.out.println((char) nextChar+" "+(int) nextChar);
        }  else {
            System.out.println("hi");
        }
    }
}
