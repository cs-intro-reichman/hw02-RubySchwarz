public class Perfect {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);

        int sum = 0;
        StringBuilder divisors = new StringBuilder();
        for (int i = 1; i < N; i++) {
            // Check if 'i' is a divisor of N.
            if (N % i == 0) {
                sum += i;

                if (divisors.length() > 0) {
                    divisors.append(" + ");
                }
                divisors.append(i);
            }
        }
        
        // Check if the sum of divisors is equal to N.
        if (sum == N) {

            // Print the result if N is a perfect number.
            System.out.println(N + " is a perfect number since " + N + " = " + divisors);
        } else {

            // Print the result if N is not a perfect number.
            System.out.println(N + " is not a perfect number");
        }
    }
}
