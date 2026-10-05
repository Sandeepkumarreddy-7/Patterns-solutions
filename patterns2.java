	public class patterns2 {
   	public static void main(String[] args) {
	    int n=7;
		for(int i=0;i<n;i++){
            int p=3;
		    for(int j=0;j<8;j++)
		    {
                
		        if((i-j>=0&&j<=n/2&&i+j<=n-1))
		        {
		        System.out.print(p);
                
		        }
		        else
		        {
		            System.out.print(" ");
            
		        }
                p=p-1;
		    }
		    	System.out.println();
                 
		}
	
		
		
	}
    
}
