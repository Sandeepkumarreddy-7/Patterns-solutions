        
public class pattern80{
    public static void main(String[] args) {
         int n =5;

        for (int i = 1; i <= n; i++) {

            int a=1;
            int b=2;

            if(i%2!=0)
            {
            for (int j = 1; j <= i; j++) {

                System.out.print(a + " ");

               a+=2;
               
            }
        }
        else
        {
             for (int j = 1; j <= i; j++) {

                System.out.print(b + " ");

            b+=2;

        }

           
       

    }
     System.out.println();


           
           
           
        }
    }

}
