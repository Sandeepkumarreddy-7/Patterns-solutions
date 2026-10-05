        
public class pattern83{
    public static void main(String[] args) {
         int n =6;
        


        for (int i = 0; i <n; i++) {

           
            for(int j=0;j<n;j++)
            {
                if(i-j>=0&&j<=n/2&&i+j<=n-1)
                {
               
                System.out.print((char)(65+j));
                }
                else
                {
                    System.out.print(" ");
                }
            }
      System.out.println();


           
           
           
        }
    }

}
