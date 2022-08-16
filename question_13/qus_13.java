package question_13;

public class qus_13 {
    public static void digit_max(int n)
    {
        int temp=1,n1,temp1;
       // temp=n%10;
        //n/=10;
        while(n>10)
        {
            n1=n%10;
            temp=n1;
            n/=10;
            temp1=n%10;
            if(temp>temp1)
            {
                temp=temp1;
            }
        }
        System.out.println(temp);

    }
    public static void main(String[] args) {
        digit_max(1890);
        
    }
    
}
