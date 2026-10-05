public class pattern44 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=2*n-1;j++)
            {
                if(i-j>=0||i+j>=2*n-1)
                System.out.print("*");
            else{
                System.out.print(" ");
            }

            }
            System.out.println();
        }
        
    }
    
}
