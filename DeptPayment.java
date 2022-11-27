import java.util.Scanner;

public class DeptPayment
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner (System.in);
        double debt,totalp,interest,payment,monint;
        int month=0;
        
        System.out.print("Please enter the initial debt: ");
        debt= s.nextDouble();
        System.out.print("Please enter the yearly interest rate (in percentages): ");                
        interest= s.nextDouble();
        System.out.print("Please enter the monthly payment you want to make: ");
        payment= s.nextDouble();    
        
        monint= interest/12;
        
        while (debt*(1 + monint/100)>=payment)
        {

            debt= (debt*(1 + monint/100))-payment;
            month++;
            
        }

        totalp= month*payment+ debt*(1 + monint/100);        
        

        System.out.println("It takes " +(month+1) +" months to pay the debt and the total payment equals to "+totalp+ " dollars");
        
    }
}
