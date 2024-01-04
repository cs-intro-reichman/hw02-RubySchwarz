public class DamkaBoard {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        for (int row = 0; row < n; row++) {

            // Determine if the row should start with an asterisk or a space
            boolean startWithAsterisk = row % 2 == 0;

            for (int col = 0; col < n; col++) {

                // Print an asterisk or a space depending on the row and column positions
                if (startWithAsterisk) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }

            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
