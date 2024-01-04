public class InOrder {
    public static void main(String[] args) {

        int lastNumber = (int) (Math.random() * 10);
        System.out.print(lastNumber);

        int newNumber;
        do {

            newNumber = (int) (Math.random() * 10);

            if (newNumber >= lastNumber) {
                System.out.print(" " + newNumber);
                lastNumber = newNumber;
            }
        } while (newNumber >= lastNumber);

        System.out.println();
    }
}
