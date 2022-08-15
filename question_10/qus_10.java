package question_10;

public class qus_10 {
    public static void last_digit(int n)
    {
        int last=0;
        while(n!=0)
        {
           last=n%10;
            break;
        }
        System.out.println(last);
    }
    public static void main(String[] args) {
        last_digit(12345);
        
    }
    
}
