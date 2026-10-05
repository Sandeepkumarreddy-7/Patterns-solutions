    public class pattern40{

        public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<=n/2)
                {
                if(i+j==n/2||i-j==-(n/2))
                {
                    System.out.print(n/2-i+1);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            else{
                if(i+j==3*(n/2)||i-j==n/2)
                {
                    
        
                    System.out.print(i-n/2+1);
                }
                
                else
                {
                    System.out.print(" ");
                }
            }
    

            }
            System.out.println();
            }
            
        }
    }
    
        


