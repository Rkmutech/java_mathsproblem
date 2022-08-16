package question_12;

public class qus_12 {
    public static int last_digit(int n)
    {
         while(n!=10)
         {
            n/=10;
         }
         return n;
    }
    public static int first_digit(int n)
    {
        return n%10;
    }
    public static void main(String[] args) {
        int  a=last_digit(34567);
        int b=first_digit(34567);
        if(a==b)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not same");
        }
        
        

    }
    
}
