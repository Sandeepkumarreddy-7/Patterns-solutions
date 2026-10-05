public class pattern84 {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 5; j++) {

                if ((i < 2 && (j == 2 || j == 4)) ||
                    (i >= 2 && i < 4 && (j == 0 || j == 2 || j == 4)) ||
                    (i == 4 && (j == 0 || j == 1 || j == 2 || j == 4)) ||
                    i == 5) {

                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}