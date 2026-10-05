public class Pattern4 {
    public static void main(String[] args) {
	    int n=7;
		for(int i=0;i<=n;i++){
		   

                for(int j=0;j<=i&&j<=n/2&&i+j<=n-1;j++)
		    {
		        if((i<=n/2))
		        {
		        System.out.print((char)(65+(n/2-i+j))+" ");
		        }
		        else
		        {
		            System.out.print((char)(65+(i-n/2+j))+" ");
		        }
		    }
			System.out.println();
             
           
           
		    
	
	
		
		
	}
    
}
}
