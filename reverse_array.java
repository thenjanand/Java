public class reverse_array {
  public static void reverse(int arr[]){
    int start=0;int end=arr.length-1;
    while(start<end){
      int temp=arr[end];
      arr[end]=arr[start];
      arr[start]=temp;

      start++;
      end--;
    }

  }
  public static void main(String[] args) {
    int arr[]={2,3,4,5,8,9}; 
    System.out.println(arr.length);
    reverse(arr);
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" "); 
    }
  }
  
}
