import java.util.Scanner;

public class Shapes

{ 
    public static void main(String[]args)
{
        Scanner s = new Scanner(System.in);
        String choice;
        int a,b,c;
        double height,base,side,sside,lside,base2,area;        
        System.out.println("Choose one of the geometric shapes (triangle, square, rectangle, parallelogram, trapezoidal) to calculate its area: ");
        choice = s.next();

        a= (int)choice.charAt(0);
        b= (int)choice.charAt(1);
        c= (int)choice.charAt(2);

        

        

        if (a==116 && b==114 && c==105)
        {
            System.out.println("Enter triangle's height and base: ");
            height = s.nextDouble();
            base = s.nextDouble();
            area= (height*base)/2;
            System.out.println("Triangle's area: " + area);
        }
        
        else if (a==115 && b==113)
        {
            System.out.println("Enter square's side: ");
            side = s.nextDouble();
            area= Math.pow(side,2);
            System.out.println("Square's area: " + area);
        }

        else if (a==114 &&b==101)
        {
            System.out.println("Enter rectangle's long side and short side: ");
            lside = s.nextDouble();
            sside = s.nextDouble();
            area= lside*sside;
            System.out.println("Rectangle's area: " + area);
         }    
    
        
        else if (a==112 && b==97)
        {
            System.out.println("Enter parallelogram's height and base: ");
            height = s.nextDouble();
            base = s.nextDouble();
            area= height*base;
            System.out.println("Parallelogram's area: " + area);
         }  

        else if (a==116 && b==114 && c==97)
        {
            System.out.println("Enter trapezoid's height and bases: ");
            height = s.nextDouble();
            base = s.nextDouble();
            base2= s.nextDouble();
            area= height*(base+base2)/2;
            System.out.println("Trapezoid's area: " + area);

        }  
    
        else
            System.out.println("No such geometric shape was found");
        

}
}            
            
            

