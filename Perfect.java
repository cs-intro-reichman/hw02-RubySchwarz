public class Perfect {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);

        int sum = 0;
        StringBuilder divisors = new StringBuilder();
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;

                if (divisors.length() > 0) {
                    divisors.append(" + ");
                }
                divisors.append(i);
            }
        }

        if (sum == N) {
            System.out.println(N + " is a perfect number since " + N + " = " + divisors);
        } else {
            System.out.println(N + " is not a perfect number");
        }
    }
}
