import java.util.Scanner;
public class ComputeDistances
//calculate mathematical results of distance problems in a practical way
{
    public static void main(String[] args)
{
        Scanner scan = new Scanner(System.in);
        int x1, x2, y1, y2;
        double manhattandistance, euclideandistance, cosinedistance;
        System.out.println("Please enter coordinate values for P1: ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();       
        System.out.println("P1 pair coordinates: " + x1 + " " +y1 );
        System.out.println();
        System.out.println("Please enter coordinate values for P2: ");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        System.out.println("P2 pair coordinates: " + x2 + " " +y2 );
        manhattandistance = Math.abs(x1-y1) + Math.abs(x2-y2);
        euclideandistance = Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
        cosinedistance = 1- ((x1*x2)+(y1*y2))/ (Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2)) * Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2)));
        System.out.println("Manhattan distance is equal to :" +manhattandistance);
        System.out.println("Euclidean distance is equal to :" +euclideandistance);
        System.out.println("Cosine distance is equal to : " +cosinedistance);

        


}

}
