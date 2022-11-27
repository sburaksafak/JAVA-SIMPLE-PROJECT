import java.util.Scanner;

public class Triange   

{ 
    public static void main(String[]args)
{
        int side1, side2, side3, small,big,middle;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter three integers to calculate is there any triangle: ");
        side1 = s.nextInt();
        side2 = s.nextInt();
        side3 = s.nextInt();

       
        // for finding smallest side
        if (side1 < side2)
            if (side1 < side3)
                small = side1;
            else
                small = side3;
        else
            if (side2<side3)
                small = side2;
            else
                small =side3;
        

        // for finding biggest side
        if (side1 > side2)
            if (side1 > side3)
                big = side1;
            else
                big = side3;
        else
            if (side2>side3)
                big = side2;
            else
                big =side3;

       


        //to find the middle value
        if(side1!=small && side1!=big)
            middle=side1;
        else 
            if (side2 != small && side2 != big)
                middle=side2;
        else
            middle=side3;


        
        if (Math.abs(small+middle)>big)
            System.out.println("There exists a triangle whose sides are " +side1+" "+side2+" "+side3+".");
        else 
            System.out.println("There does not exist a triangle whose sides are " +side1+" "+side2+" "+side3+".");         







/*
 // for finding smallest side
        if (side1 < side2)
            if (side1 < side3)
                System.out.println("side1 is the smallest side.");
            else
                System.out.println("side3 is the smallest side.");
        else
           if (side2 < side3)
             System.out.println("side2 is the smallest side.");
         else
                System.out.println("side3 is the smallest side.");

        // for finding smallest side
        if (side1 > side2)
           if (side1 > side3)
             System.out.println("side1 is the biggest side.");
          else
              System.out.println("side3 is the biggest side.");
        else
            if (side2 > side3)
                System.out.println("side2 is the biggest side.");
          else
               System.out.println("side3 is the biggest side.");*/








}
}
