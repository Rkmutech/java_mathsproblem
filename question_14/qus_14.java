package question_14;

public class qus_14 {
    public static void location_max(int n) {
        int lag=0;
        int lag_pos=0;
        int count=0;
        while(n!=0)
        {
            count++;
            int rem=n%10;
            if(rem>lag)
            {
                lag=rem;
                lag_pos=count;
            }
            
            n/=10;
        }
       /*  for(int i=0;i<lag_pos;i++)
        {
            
        }*/

        System.out.print(lag_pos);
    }
    public static void main(String[] args) {
        location_max(34956);
        
    }
    
}
