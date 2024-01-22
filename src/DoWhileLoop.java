public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println(counter + " Java");
            counter++;
        } while (counter < 15);

        System.out.println("Outside the loop");
    }
}
