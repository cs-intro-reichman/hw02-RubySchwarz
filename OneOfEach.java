public class OneOfEach {
    public static void main(String[] args) {
        boolean hasBoy = false;
        boolean hasGirl = false;
        int childrenCount = 0;

        // Loop until both a boy and a girl have been "born"        
        while (!hasBoy || !hasGirl) {
            
            // Generate a random number and check if it's less than 0.5
            if (Math.random() < 0.5) {
                
                // If true, it's a boy
                System.out.print("b ");
                hasBoy = true;  // Set the flag indicating a boy has been born
            } else {
                
                // Otherwise, it's a girl               
                System.out.print("g ");
                hasGirl = true;  // Set the flag indicating a girl has been born
            }
            childrenCount++; // Increment the children count
        }

        // Once both a boy and a girl have been born, print the total number of children
        System.out.println("\nYou made it... and you now have " + childrenCount + " children.");
    }
}
