package question_17;

public class qus_17 {
    public static int rev(int n)
    {
       int rev=0;
       while(n!=0)
       {
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;

       }
       return rev;
    }
    public static void main(String[] args) {
       int rev=rev(789046);
        System.out.println(rev);
    }
    
}
