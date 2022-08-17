package question_6;

public class qus_6 {
    public static void count_even(int n)
    {
        int count=0;
        while(n!=0)
        {
         int n1=n%10;
          if(n1%2==0)
          {
            count++;
          }
          n/=10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        count_even(2345466);
        System.out.println("Next input:");
        count_even(738358884);
        System.out.println("Next input:");
        count_even(111111);
        
    }
    
}
