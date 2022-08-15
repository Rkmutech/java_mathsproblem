package question_4;

public class qus_4 {
    public static void sum_odd_int(int n)
    {
        int count=0,sum=0;
        while(n!=0)
        {
            ++count;
            
            if(count%2!=0)
            {
            sum+=n%10;
            }
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        sum_odd_int(56789);
        
    }
    
}
