public class binomial_coeficient {
  public static int fact(int n)
  {
    int f=1;
    for(int i=1;i<=n;i++)
    {
      f=f*i;
    }
    return f;
  }

  public static int binCoeff(int n,int r)
  {
    int fact_n=fact(n);
    int fact_r=fact(r);
    int fact_nmr=fact(n-r);

    int binCoeff= fact_n/(fact_r*fact_nmr);
    return binCoeff;
  }
  public static void main(String[] args) {
    System.out.println("The Binomial coefficient od 5 and 2 is "+binCoeff(5, 2));
  }
  
}
