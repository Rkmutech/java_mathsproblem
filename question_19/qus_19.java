package question_19;

public class qus_19 {
    public static void divides(int N,int n)
    {
        int count=0;
        while(N!=0)
        {
          int temp=N%10;
          if(temp%n==0)
          {
            count++;
          }
          N/=10;
          
        }
        System.out.println("The digit is:"+count);
        //return count;
    }
    public static void main(String[] args) {
        divides(126788, 2);
        
    }
    
}
