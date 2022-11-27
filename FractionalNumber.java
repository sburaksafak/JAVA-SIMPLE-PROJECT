import java.util.Scanner;

public class FractionalNumber
{
    private int num;    
    private int denom;
    private String st;


    
            


    public FractionalNumber (String str)
    {

       st = str;
       int i=0;
        while(i<st.length())
            {
                if((int)st.charAt(i)==47)
                    {
                        num=Integer.parseInt(st.substring(0,i));
                        denom=Integer.parseInt(st.substring(i+1,st.length()));
                        break;



                    }
                else
                    i++;
                
            }
    }

    public FractionalNumber (int numerator, int denominator)
    {
        num = numerator;
        denom = denominator;
    }

 
    public double getDoubleValue()
    {
            

        double temp= (double)num/denom;
        return temp;

    }








    public String toString()
    {
        String intfractional = ""+num+"/"+denom;
        return intfractional;

    }
    //This method should return string representation of this fractional number which is formatted as " numerator/denominator". For example if the
    //numerator is 4 and denominator is 5, then method should return "4/5".



    public boolean equals(FractionalNumber fn2)
    {
        
    
       return (double)num/(double)denom == (double)fn2.num/(double)fn2.denom ;
            

    //This method should return true if this FractionalNumber is equivalent to fn2
    }




    public FractionalNumber simplify()
    {
        int maxmultiplier = 2; // initialize etmeyince niye çalışmıyor
        
        
    
        

        
        for(int i=1; i <= Math.abs(num); i++ )  
        {

            if(num%i==0 && denom%i==0)
            {
                maxmultiplier = i;
            }
        
        }
            
               
        if(num==0)   
        {
            return new FractionalNumber(0,1);
        
        }
        
        else if(num*denom<0)
        {
              return new FractionalNumber(Math.abs(num)/(maxmultiplier)*(-1),Math.abs(denom)/maxmultiplier);   
        }
    
        else
        {
              return new FractionalNumber(Math.abs(num)/maxmultiplier,Math.abs(denom)/maxmultiplier);  
        }
    
    }
        public FractionalNumber add(FractionalNumber fn2)
        {
         int a =   (num * fn2.denom)+(fn2.num*denom);
         int b =   denom*fn2.denom;
    
        return new FractionalNumber(a,b).simplify();

        }

        public FractionalNumber subtract(FractionalNumber fn2)
        {
         int a =   (num * fn2.denom)-(fn2.num*denom);
         int b =   denom*fn2.denom;
        
                return new FractionalNumber(a,b).simplify();
        }
    
        public FractionalNumber multiply(FractionalNumber fn2)
        {
            int a =  num * fn2.num;
            int b =  denom*fn2.denom;   

            return new FractionalNumber(a,b).simplify(); 

    
        }    

        public FractionalNumber divide(FractionalNumber fn2)
        {

            
            int a= num*fn2.denom;
            int b= denom*fn2.num;

            if(b==0)
                return null;
    
            else
                return new FractionalNumber(a,b).simplify(); 

        }
    

}

