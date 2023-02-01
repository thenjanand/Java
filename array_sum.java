public class array_sum {
  
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int sum=0;
   for(int i=0;i<20;i++){
    if((arr[i]%3==0) || (arr[i]%5==0)){
      sum=sum+arr[i];
      System.out.print(arr[i]+" ");
    }
    
   }
   System.out.print("\n Sum = "+sum);
  }
  
}
