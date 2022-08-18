package question_18;

public class qus_18 {
    public static void  digit_root(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        
        count(sum);
    }
    public static void count(int sum)
    {
        int count=0;
        while(sum!=0)
        {
            count++;
            sum/=10;
              
        }
        //System.out.println("The sum is:"+sum);
    }
    public static void main(String[] args) {
        digit_root(34567);
    }
    
}
