public class pattern64{
    public static void main(String[] args) {

        int n = 6;

        for (int i =1; i <= n; i++) {
           int  k=i;
            if(i%2!=0)
            {
                k=i+1;
            }

            for(int j=0;j<=n-k+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
             
        }


           
           
           
        }
    }
