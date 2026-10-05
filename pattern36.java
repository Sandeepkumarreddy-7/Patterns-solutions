    public class pattern36{

        public static void main(String[] args) {
        int n=5;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n-1-i;j++)

            {
            System.out.print(" ");
            }
            System.out.print((char)(64+n-(n-i-1)));
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            if(i>0)
            {
            System.out.print((char)(64+n-(n-i-1)));
            }
            
                       

            System.out.println();
        }
    }
        

}
