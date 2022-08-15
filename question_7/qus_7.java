package question_7;

public class qus_7 {
    public static void count_odd_digit(int n)
    {
      int count=0;
      while(n!=0)
      {
        int n1=n%10;
        if(n1%2!=0)
        {
            count++;
        }
       n/=10;
      }
      System.out.println(count);
    }
    public static void main(String[] args) {
        count_odd_digit(35790);

        
    }
    
}
