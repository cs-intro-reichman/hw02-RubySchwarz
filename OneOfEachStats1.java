public class OneOfEachStats1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java OneOfEachStats1 <number of experiments>");
            return;
        }

        int T = Integer.parseInt(args[0]);
        int[] countArray = new int[T + 1];
        int totalChildren = 0;

        // Run experiments for the specified number of times.
        for (int i = 0; i < T; i++) {
             // Flags to check if a boy or a girl is born.
            boolean hasBoy = false;
            boolean hasGirl = false;
            // Counter for the number of children in the current experiment.
            int childrenCount = 0;

            // Continue having children until both a boy and a girl are born.
            while (!hasBoy || !hasGirl) {
                
                // Simulate the birth of a child with 50% chance for each gender.
                if (Math.random() < 0.5) {
                    hasBoy = true;
                } else {
                    hasGirl = true;
                }
                childrenCount++;
            }

            // Add the number of children from this experiment to the total.
            totalChildren += childrenCount;
            if (childrenCount <= T) {
                countArray[childrenCount]++;
            } else {
                countArray[T]++;
            }
        }

        // Calculate and print the average number of children to get at least one of each gender.
        double average = (double) totalChildren / T;
        System.out.println("Average: " + average + " children to get at least one of each gender.");

        // Print the number of families with exactly 2 or 3 children.
        System.out.println("Number of families with 2 children: " + countArray[2]);
        System.out.println("Number of families with 3 children: " + countArray[3]);
        
        // Calculate and print the number of families with 4 or more children.
        int fourOrMore = 0;
        for (int i = 4; i <= T; i++) {
            fourOrMore += countArray[i];
        }
        System.out.println("Number of families with 4 or more children: " + fourOrMore);

        // Find the most common number of children.
        int maxCount = 0;
        int mostCommon = 0;
        for (int i = 2; i <= T; i++) {
            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                mostCommon = i;
            }
        }
        System.out.println("The most common number of children is " +
                (mostCommon == T ? "4 or more" : mostCommon) + ".");
    }
}
