public class DamkaBoard {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        for (int row = 0; row < n; row++) {
            boolean startWithAsterisk = row % 2 == 0;

            for (int col = 0; col < n; col++) {
                if (startWithAsterisk) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
