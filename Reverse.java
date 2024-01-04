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

            // Check if the length of the input string is odd
            if (input.length() % 2 != 0) {
            
                // If odd, print the middle character    
                System.out.println("The middle character is " + input.charAt(input.length() / 2));
            } else {

                // If even, print the character before the exact middle
                System.out.println("The middle character is " + input.charAt((input.length() / 2) - 1));
            }
        }
    }
}
