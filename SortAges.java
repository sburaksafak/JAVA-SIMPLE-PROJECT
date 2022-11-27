import java.util.Scanner;

public class SortAges

{ 
    public static void main(String[]args)
{
        Scanner s = new Scanner(System.in);
        int bıdık,defne,subramani,matthew,hang,bıdıkage,defneage,subramaniage,matthewage,hangage;
        String youngest, oldest;
        System.out.println("Please enter your birth years: ");
        System.out.print("Mr Bıdık's birth year: ");
        bıdık = s.nextInt();
        System.out.print("Defne's birth year: ");
        defne =  s.nextInt();
        System.out.print("Subramani's birth year: ");
        subramani = s.nextInt();
        System.out.print("Matthew's birth year: ");
        matthew = s.nextInt();
        System.out.print("Hang's birth year: ");
        hang = s.nextInt();
        bıdıkage = 2022-bıdık;
        defneage = 2022-defne;
        subramaniage = 2022-subramani;
        matthewage= 2022-matthew;
        hangage = 2022 -hang;
        System.out.println("Mr Bıdık is " +bıdıkage + "  years old. ");
        System.out.println("Defne is " +defneage + "  years old. ");
        System.out.println("Subramani is " +subramaniage + "  years old. ");
        System.out.println("Matthew is " +matthewage +  "  years old. ");
        System.out.println("Hang is " +hangage+  "  years old. ");

        
        if (bıdıkage<defneage && bıdıkage<subramaniage && bıdıkage<matthewage && bıdıkage< hangage)
         {   
            youngest = " Mr. Bıdık";
            System.out.println( "Youngest: " +youngest); 
        }
        else if ( defneage<bıdıkage && defneage<subramaniage && defneage<matthewage && defneage<hangage)
        {         
            youngest = "Defne";
            System.out.println( "Youngest: " +youngest); 
        }        
        else if (subramaniage<bıdıkage && subramaniage<defneage && subramaniage<matthewage && subramaniage<hangage)
        {
            youngest = "Subramani";
            System.out.println( "Youngest: " +youngest);         
        }
        else if (matthewage<bıdıkage && matthewage<defneage && matthewage<subramaniage && matthewage<hangage)
        {
            youngest = "Matthew";
            System.out.println( "Youngest: " +youngest); 
        }        
        else if (hangage<bıdıkage && hangage<defneage && hangage<subramaniage && hangage<matthewage)
        {        
            youngest = "Hang";
            System.out.println( "Youngest: " +youngest); 
        }
        

        if (bıdıkage>defneage && bıdıkage>subramaniage && bıdıkage>matthewage && bıdıkage >hangage)
         {   
            oldest = " Mr. Bıdık";
            System.out.println( "Oldest: " +oldest); 
        }
        else if ( defneage>bıdıkage && defneage>subramaniage && defneage>matthewage && defneage>hangage)
        {         
            oldest = "Defne";
            System.out.println( "Oldest: " +oldest); 
        }        
        else if (subramaniage>bıdıkage && subramaniage>defneage && subramaniage>matthewage && subramaniage>hangage)
        {
            oldest = "Subramani";
            System.out.println( "Oldest: " +oldest);         
        }
        else if (matthewage>bıdıkage && matthewage>defneage && matthewage>subramaniage && matthewage>hangage)
        {
            oldest = "Matthew";
            System.out.println( "Oldest: " +oldest); 
        }        
        else if (hangage>bıdıkage && hangage>defneage && hangage>subramaniage && hangage>matthewage)
        {        
            oldest = "Hang";
            System.out.println( "Oldest: " +oldest); 
        }
        

}
}
