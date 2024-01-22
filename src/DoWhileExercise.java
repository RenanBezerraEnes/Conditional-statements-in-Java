import java.util.Scanner;

public class DoWhileExercise {
    public static void main(String[] args) {
        int input = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your first number");
            int first = scanner.nextInt();
            System.out.println("Please enter your second number");
            int second = scanner.nextInt();

            System.out.println("Sum : " + (first + second));
            System.out.println("Enter 1 to continue, to exit enter anything else");
            input = scanner.nextInt();
        } while(input == 1);
    }
}
