public class qus_1 {
    public static void count_int(int n)
    {
        int count=0; 
        while(n!=0)
        {
            count++;
            n=n/10;

        }
        System.out.println(count);
    }
 public static void main(String[] args) {
    count_int(12345);
 }   
}
