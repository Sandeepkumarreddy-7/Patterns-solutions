public class pattern87 {
    public static void main(String[] args) {
        
        int n=6;
        
        
        for(int i=1;i<n;i++)
        {
            

                for(int j=1;j<=n;j++)
                {

                   
                    if(j%2==0)
                    {
                    System.out.print(i+" ");
                   
                    }
                    else
                    {
                        System.out.print((j+1)/2+" ");
                    }
                   
                }
               
            
            System.out.println();
        }
    }
    
}
