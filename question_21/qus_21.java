package question_21;

public class qus_21 {
    public static void palinadrom(int n)
    {
        int rev=0;
        int temp=n;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
            
        }
        if(temp==rev)
        {
            System.out.println("Palindorm");
        }
        else 
        {
            System.out.println("Not palindorm");
        }
      // return rev;
        
    }
    public static void main(String[] args) {
      palinadrom(121);
        System.out.println("Next input");
        palinadrom(2345);
        System.out.println("Next input");
        palinadrom(999999);
        
    }
    
}
