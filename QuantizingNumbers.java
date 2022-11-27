import java.util.Scanner;
public class QuantizingNumbers
{   
    public static void main(String[]args)
{       
        
        double x1, x2, x3, x4, x5, x6,  value1, value2, value3, value4, value5, value6;     
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter six numbers in decreasing order : ");
        
        x1 = s.nextInt();
        x2 = s.nextInt();
        x3 = s.nextInt();
        x4 = s.nextInt();
        x5 = s.nextInt();
        x6 = s.nextInt();
       
        int a =(int)x1;
        int b =(int)x2;
        int c =(int)x3;
        int d =(int)x4;
        int e =(int)x5;
        int f =(int)x6;
        
        
             
         System.out.println("Entered six numbers in decreasing order : ");
         System.out.println( a+ " "+b+" "+c+" "+d+" "+e+" "+f);
        
        value1 = (x1 - x6) / (x1 - x6);
        value2 = (x2 - x6) / (x1 - x6);
        value3 = (x3 - x6) / (x1 - x6);
        value4 = (x4 - x6) / (x1 - x6);
        value5 = (x5 - x6) / (x1 - x6);
        value6 = (x6 - x6) / (x1 - x6);
        System.out.println("New value of x1 is : "+ value1);
        System.out.println("New value of x2 is : "+ value2);
        System.out.println("New value of x3 is : "+ value3);
        System.out.println("New value of x4 is : "+ value4);
        System.out.println("New value of x5 is : "+ value5);
        System.out.println("New value of x6 is : "+ value6);
      
       



}

}
