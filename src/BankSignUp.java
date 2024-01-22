import java.util.Scanner;

public class BankSignUp {
    public static void main(String[] args) {
        System.out.println("Please enter your age!");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age > 21){
            System.out.println("Eligible");
        } else {
            System.out.println("Ineligible");
        }
    }
}
