public class pattern85 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 8; j++) {

                if (i == 0 ||
                    (i == 1 && j < 3) ||
                    i == 2 ||
                    (i == 3 && j < 1) ||
                    (i == 4 && j < 6)) {

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