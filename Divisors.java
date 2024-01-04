public class Divisors {
    public static void main(String[] args) {

        // This is the number for which we want to find the divisors.
        int number = Integer.parseInt(args[0]);

        for (int i = 1; i <= number; i++) {

            // Checks if 'i' is a divisor of 'number'
            if (number % i == 0) {

                System.out.println(i);
            }
        }
    }
}
