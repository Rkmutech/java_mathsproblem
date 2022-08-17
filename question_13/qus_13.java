package question_13;

public class qus_13 {
    public static void digit_max(int n)
    {
        /*int temp=1,n1,temp1;
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
            }*/
            int largest=0;
            int count=0;
            while(n!=0)
            {
                count++;
                int rem=n%10;
                if(rem>largest)
                largest=rem;
                n/=10;
                
            }
            System.out.println(largest);
        }
        

    
    public static void main(String[] args) {
        digit_max(1890);
        System.out.println("Next input");
        digit_max(745466);
        
    }
    
}
