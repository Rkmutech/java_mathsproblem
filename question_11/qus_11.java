package question_11;

public class qus_11 {
    public static void first_digit(int n)
    {
       // int first=0;
        while(n>=10)
        {
           n/=10; 
        }
        //System.out.println(first);
        System.out.println(n);
    }
    public static void main(String[] args) {
        first_digit(4675);
        
    }
    
}
