import java.util.Scanner;

public class GamblersRuin
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        int money,goal,g,win=0,lose=0,i=1;
        double p;
        System.out.print("Initial money: ");
        money= s.nextInt();
        System.out.print("Goal: ");
        goal = s.nextInt();
        System.out.print("Probability of winning in a round: ");
        p= s.nextDouble();
        
        System.out.print("Number of times the game will be simulated: ");  
        g = s.nextInt();

        while  (i<=g) 
        {
            int amoney;
            double game;            
            amoney=money;
            while  (amoney>0 && amoney<goal)  
                {
                  game= (double)(Math.random());    
                  if (game<=p)
                    amoney++;  
                  else
                    amoney--;      
                }
            if(amoney==goal)
                win++;
            else
                lose++;  
                      
            i++;
        }
        
        System.out.println("Win:"+win);
        System.out.println("Lose:"+lose);        


}

}
