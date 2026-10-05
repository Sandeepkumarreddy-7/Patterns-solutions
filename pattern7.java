public class pattern7 {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<n;j++)
		    {
                
		        if(i>=n/2&&j>=n/2)
		        {
		        System.out.print(n/2-i+j);
		        }
		        else
		        {
		            System.out.print(i-n/2+j);
		        }
		    }
            System.out.print(" ");
            

            System.out.println();
}
    }
    
}
