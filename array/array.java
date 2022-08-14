package array;

public class array {
    public static void rev(int arr[],int len,int k)
{
   for(int i=0;i<k;i++)
   {
     int temp=arr[i];
     arr[i]=arr[len];
     arr[len]=temp;
   }
   for(int i=0;i<len;i++)
   {
    System.out.println(arr[i]);
}
   }
   
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
       int  len=arr.length;
       int k=2;
       rev(arr,len, k);

    }
    
}
