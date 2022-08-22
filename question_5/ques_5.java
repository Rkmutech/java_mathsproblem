package question_5;

public class ques_5 {
    public static void sum_Even_int(int n)
    {
        int count=0,sum=0;
        while(n!=0)
        {
            count++;
            
            if(count%2==0)
            {
            sum+=n%10;
            }
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum_Even_int(23456);
        System.out.println("next input");
        sum_Even_int(2456);
        
    }
    
}
