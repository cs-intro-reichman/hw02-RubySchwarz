public class OneOfEach {
    public static void main(String[] args) {
        boolean hasBoy = false;
        boolean hasGirl = false;
        int childrenCount = 0;

        while (!hasBoy || !hasGirl) {
            if (Math.random() < 0.5) {
                System.out.print("b ");
                hasBoy = true;
            } else {
                System.out.print("g ");
                hasGirl = true;
            }
            childrenCount++;
        }

        System.out.println("\nYou made it... and you now have " + childrenCount + " children.");
    }
}
