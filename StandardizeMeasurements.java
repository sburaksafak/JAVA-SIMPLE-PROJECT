import java.util.Scanner;

public class StandardizeMeasurements
//converting unfamiliar measurements to more daily life measurements
{
    public static void main(String[] args)
{
        Scanner scan = new Scanner(System.in);
        float feet, reamur, cm, celcius;
        final float CONVERSION_FACTOR_CM = 30.48f; // a feet equals to 30.48 cm
        final float CONVERSION_FACTOR_CELCİUS = 1.25f;    // a  reamur degrees equals to 5/4 celcius        
        System.out.println("Enter measurements: " );
        feet = scan.nextFloat();
        reamur = scan.nextFloat();
        System.out.println("Your answers are detected: " + feet + " feet " + " in " + reamur + " Reamur " + " degrees ");   
        System.out.println();   
        cm = feet * CONVERSION_FACTOR_CM ; 
        celcius = reamur * CONVERSION_FACTOR_CELCİUS;
        System.out.println("Measure in centimeters and celcius: " + cm + " cm " + " in " + celcius + " celcius " + " degrees. " );
                




}
}


