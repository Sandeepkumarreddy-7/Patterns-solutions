    public class pattern34 {

        public static void main(String[] args) {
        int n=5;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n-1-i;j++)

            {
            System.out.print(" ");
            }
            System.out.print(n-i);
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            if(i>0)
            {
            System.out.print(n-i);
            }
            
                       

            System.out.println();
        }
    }
        

}
