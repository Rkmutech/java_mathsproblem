package bank_problem;

import java.util.Scanner;

public class bank {
    public bank()
    {
        
        System.out.println("Enter the your accont number:");
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        System.out.println("Enter the your accont number:");
        String name =sc.nextLine();
        System.out.println("Enter the your accont number:");
        int age=sc.nextInt();
    }
    class debit extends bank{
        public   debit()
        {

       
        debit obj2=new debit();
       if(debit.age>18)
       {
        System.out.println("Your eligliable for debit card");
       } 
    }
}
    public static void main(String[] args) {
         
        debit obj3=new debit();
       obj3. bank();
    }
    
}
