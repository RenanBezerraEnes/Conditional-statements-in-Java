import java.util.Scanner;

public class FactorialExercise {
    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int factorial = 1, i = 1;

        while (a >= i){
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial for " + a + " is " + factorial);
    }
}
