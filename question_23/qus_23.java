package question_23;

public class qus_23 {
    public  static void maximum_form(int n)
     {
         
         int max_no=0;
         for(int i=9;i>=0;i--)
         {
            int temp=n;
            while(n!=0)
            {
                int rem=temp%10;
                if(rem==i)
                {
                    max_no=max_no*10+rem;
                }
                temp=temp/10;
            }
         }
       
        System.out.println(max_no);
        
    }
    public static void main(String[] args) {
        maximum_form(45168);
        
    }
    
}
