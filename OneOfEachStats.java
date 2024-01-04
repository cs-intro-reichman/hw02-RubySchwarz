public class OneOfEachStats {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java OneOfEachStats <number of experiments>");
            return;
        }

        int T = Integer.parseInt(args[0]);
        int totalChildren = 0;
        int count2 = 0, count3 = 0, count4OrMore = 0;
        int mostCommonCount = 0, mostCommonValue = 0;

        for (int i = 0; i < T; i++) {
            boolean hasBoy = false;
            boolean hasGirl = false;
            int childrenCount = 0;

            while (!hasBoy || !hasGirl) {
                if (Math.random() < 0.5) {
                    hasBoy = true;
                } else {
                    hasGirl = true;
                }
                childrenCount++;
            }

            totalChildren += childrenCount;

            // Update counts for 2, 3, and 4 or more children
            if (childrenCount == 2) {
                count2++;
            } else if (childrenCount == 3) {
                count3++;
            } else if (childrenCount >= 4) {
                count4OrMore++;
            }

            // Update most common count
            int currentCount = childrenCount == 2 ? count2 : (childrenCount == 3 ? count3 : count4OrMore);
            if (currentCount > mostCommonCount) {
                mostCommonCount = currentCount;
                mostCommonValue = childrenCount >= 4 ? 4 : childrenCount;
            }
        }

        double average = (double) totalChildren / T;
        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + count2);
        System.out.println("Number of families with 3 children: " + count3);
        System.out.println("Number of families with 4 or more children: " + count4OrMore);
        System.out.println("The most common number of children is " +
                (mostCommonValue == 4 ? "4 or more" : mostCommonValue) + ".");
    }
}
