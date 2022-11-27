import java.util.Random;
public class RandomPasswordGenerator
// Generates random numbers in various ranges.
{
    public static void main(String[]args)
{   
        Random r = new Random();
        char a, b, A, B, c, C;
        int digit;
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        a = (char) (r.nextInt(26) + 'a');  
        b = (char) (r.nextInt(26) + 'a');      
        digit = r.nextInt(10);
        A = (char) (r.nextInt(26) + 'A');
        B = (char) (r.nextInt(26) + 'A');
        c = abc.charAt(r.nextInt(abc.length()));        
        C = abc.charAt(r.nextInt(abc.length()));






        System.out.println("Your password: " +a+b+digit+A+B+c+C);




        



}        

}
