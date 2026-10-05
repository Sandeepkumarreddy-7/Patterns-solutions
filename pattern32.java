    public class pattern32{

        public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)

            {
            System.out.print(" ");
            }
            System.out.print((char)(64+n-i));
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            if(i>0)
            {
            System.out.print((char)(64+n-i) );
            }
           
            
                       

            System.out.println();
        }
    }
        

}
