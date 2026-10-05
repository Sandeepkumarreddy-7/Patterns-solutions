public class pattern86 {
    public static void main(String[] args) {
        
        int n=6;
        int k=0;
        
        for(int i=1;i<n;i++)
        {
            

                for(int j=1;j<=n;j++)
                {

                   
                    if(j%2==0)
                    {
                    System.out.print(j/2+" ");
                   
                    }
                    else
                    {
                        System.out.print(i+" ");
                    }
                   
                }
               
            
            System.out.println();
        }
    }
    
}
