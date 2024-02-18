import java.util.Scanner;

public class PositiveOrNegativeNumber {
    private static Scanner keyboard;
    public static void main(String[] args) {
        System.out.print("Please, enter a number: ");
        keyboard = new Scanner(System.in);
        int theNumber = keyboard.nextInt();

        if (theNumber < 0) {
            System.out.println("The entered number is negative.");
        } else if (theNumber > 0) {
            System.out.println("The entered number is positive.");
        } else {
            System.out.println("The entered number is 0.");
        }
    }
}
