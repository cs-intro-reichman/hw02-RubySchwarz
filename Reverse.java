public class Reverse {
    public static void main(String[] args) {

        if (args.length > 0) {
            String input = args[0];
            String reversed = "";
            int i = input.length() - 1;

            while (i >= 0) {
                reversed += input.charAt(i);
                i--;
            }

            System.out.println(reversed);

            if (input.length() % 2 != 0) {
                System.out.println("The middle character is " + input.charAt(input.length() / 2));
            } else {
                System.out.println("The middle character is " + input.charAt((input.length() / 2) - 1));
            }
        }
    }
}
