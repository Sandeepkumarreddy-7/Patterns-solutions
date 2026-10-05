        
public class pattern81{
    public static void main(String[] args) {
         int n =5;
         int a=1;


        for (int i = 1; i <=n; i++) {
           
            int temp = a + i - 1;

            for (int j = i - 1; j >= 0; j--) {
                System.out.print(temp + " ");
                temp--;
            }

            a = a + i;
     System.out.println();


           
           
           
        }
    }

}
