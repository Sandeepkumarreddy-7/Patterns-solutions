public class pattern67{
    public static void main(String[] args) {

        int n = 6;
        int  k=0;
        int p=2;


        for (int i =1; i <= n; i++) {
            
            for(int j=0;j<p;j++)
            {
                System.out.print(" ");
            }
            if(i%2==0)
            {
                p-=1;
            }


           
            if(i%2!=0)
            {
                k+=1;
            }

            for(int j=0;j<k;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
             
        }


           
           
           
        }
    }
