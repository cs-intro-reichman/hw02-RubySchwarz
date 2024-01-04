public class OneOfEachStats1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java OneOfEachStats1 <number of experiments>");
            return;
        }

        int T = Integer.parseInt(args[0]);
        int[] countArray = new int[T + 1];
        int totalChildren = 0;

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
            if (childrenCount <= T) {
                countArray[childrenCount]++;
            } else {
                countArray[T]++;
            }
        }

        double average = (double) totalChildren / T;
        System.out.println("Average: " + average + " children to get at least one of each gender.");

        System.out.println("Number of families with 2 children: " + countArray[2]);
        System.out.println("Number of families with 3 children: " + countArray[3]);
        int fourOrMore = 0;
        for (int i = 4; i <= T; i++) {
            fourOrMore += countArray[i];
        }
        System.out.println("Number of families with 4 or more children: " + fourOrMore);

        // Find the most common number of children
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
