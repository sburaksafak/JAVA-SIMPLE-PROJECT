import java.util.Scanner;
public class ComputeKinematics
//calculate mathematical results of physics problems in a practical way
{
    public static void main(String[]args)
{
        Scanner scan = new Scanner(System.in);
        double velocity, altitude, time; 
        System.out.print("Enter initial velocity:");
        velocity = scan.nextDouble();
        time = velocity/9.81*2;
        altitude = 9.81*time*time/8;
        System.out.println("Entered velocity: " + velocity);
        System.out.println("Maximum altitude: " + altitude);
        System.out.println("Duration of the movement: " + time);
        
        
        
        
        
        
    



}

}



