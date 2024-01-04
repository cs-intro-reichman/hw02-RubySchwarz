public class InOrder {
    public static void main(String[] args) {
      
        // Generate a random integer between 0 and 9
        int lastNumber = (int) (Math.random() * 10);
        System.out.print(lastNumber);

        int newNumber;
        do {

            // Generate a new random integer between 0 and 9
            newNumber = (int) (Math.random() * 10);

            // Check if the new number is greater or equal to the last number
            if (newNumber >= lastNumber) {
              
                // If so, print the new number followed by a space 
                System.out.print(" " + newNumber);
                
                // Update the last number to be the new number
                lastNumber = newNumber;
            }
            // Continue the loop as long as the new number is greater than or equal to the last number
        } while (newNumber >= lastNumber);

        System.out.println();
    }
}
