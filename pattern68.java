public class pattern68{
    public static void main(String[] args) {

        int n = 5;
        int  k=0;

        for (int i =1; i <= n; i++) {
            
           
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
