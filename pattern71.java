public class pattern71{
    public static void main(String[] args) {

        int n = 6;
        int  k=2;
        int p=1;

        for (int i =1; i <= n; i++) {
           

            for(int j=0;j<k;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<p;j++)
            {
                System.err.print("*");
            }

            if(i%2==0)
            {
                k-=1;
            }
            
            if(i%2==0)
            {
                p+=2;
            }
            System.out.println();
             
        }


           
           
           
        }
    }
