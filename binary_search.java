public class binary_search {

  public static int binary(int arr[],int key)
  {
    int start =0,end=arr.length-1;//
    for(int i=start;i<=end;)
    {
      int mid=(start+end)/2;
      System.out.println("value of mid ="+mid);

      if(arr[mid]==key)
      {
      return mid;
      }
      if(arr[mid]<key){
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={2,4,6,8,10,11};
    int key=10;
    System.out.println("Index for key is :"+binary(arr, key));
    
  }
  
}
