package question_2;

public class qus_2 {
    public static void count_even_odd(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
            
        
        }
        if(count%2==0)
        {
            System.out.println("the Digit count Length is Even:"+count);
        }
        else if(count%2==1)
        {
            System.out.println("the Digit count Length is ODD:"+count);
        }
    }

    public static void main(String[] args) {
        count_even_odd(1244789);
        count_even_odd(124474);
        
    }
    
}
