public class SmallestNumber
{

    public static int findSmall(int[] A,int k){

        
        int small=Integer.MAX_VALUE;
        int B[]=new int[A.length];
        
        for(int j=0;j<B.length;j++){

            int smallIndex=-1;
            boolean girdi=false;
            for(int i=0;i<A.length;i++){
                
                if(A[i]<small){
                    small=A[i];
                    smallIndex=i;
                    girdi=true;
                    
                }
                    
                
            }
            
            
            /*if(girdi){
                A[smallIndex]=Integer.MAX_VALUE;
                //girdi=false;
            }
                
                
            else{
                A[0]=Integer.MAX_VALUE;
            }*/
            
            A[smallIndex]=Integer.MAX_VALUE;    
            B[j]=small;
            small=Integer.MAX_VALUE;
        }
        /*for(int i=0;i<B.length;i++)
            System.out.println("B:"+B[i]);
*/
        return B[k-1];


    }


    public static void main(String[] args)
    {
        
        int[] A = {6,3,2,5,7};
        int[] G = {100000000,2,4,5,7,9,1234,156345,23,5,67,8,9,3};
        System.out.println(findSmall(A, 3));
    } 

     
}



/* 
1. en küçüğü karşılaştırma youyla bul
2. en küçüğü yeni bir diziye koy
3. en küçüğü ilk diziden kaldır
3. 2. en küçüğü bulup diziye koy
4. kaldır ve dizinin sonuna kadar böyle devam et







                           


 //yeni oluşturduğun objenin arrayine en küçük sayıyı sırayla ekliyorsun,    tüm for döngüsü en küçük sayıyı bulmak içindi   , daha sonra en küçük sayıyı ilk arraydan kaldır ve 2. en küçüğü bul */
