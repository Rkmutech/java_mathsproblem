package question_8;

public class qus_8 {
    public static void odd_sum(int n)
    {
        int count=0,sum=0;
        while(n!=0)
        {
            count++;
            sum+=n%10;
            n=n/10;

        }
        if(count%2==1)
        {
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        odd_sum(12784);
        
    }
}
