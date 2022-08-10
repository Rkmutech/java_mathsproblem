package question_9;

public class qus_9 {
    public static void even_sum(int n)
    {
        int count=0,sum=0;
        while(n!=0)
        {
            count++;
            sum+=n%10;
            n=n/10;

        }
        if(count%2==0)
        {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        even_sum(565890);
        
    }
}
