import java.util.Scanner;

public class QuoteAge

{ 
    public static void main(String[]args)
{
        Scanner s = new Scanner(System.in);
        String name, surname, quote;
        int yearb, yearq, yeard;
        System.out.println("Please enter the full name and the birthdate of a famous person: ");

        name = s.next();
        surname = s.next();
        yearb = s.nextInt();

        System.out.println("Please enter a quote of this person: ");    
        quote = s.nextLine();
        quote = s.nextLine();   
        
        
        System.out.println("Please enter the year that this quote is said: ");
        yearq = s.nextInt();
        yeard= yearq- yearb;

        System.out.println(name+" "+surname+" said " + "\""+ quote +"\" at the age of " + yeard+ "." );
        
       
        
        

}
}
        
