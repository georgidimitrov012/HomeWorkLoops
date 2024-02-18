import java.util.Scanner;

public class WhichIsBigger {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNum = keyboard.nextInt();
        System.out.println("Enter the second number:");
        int secondNumb = keyboard.nextInt();
        System.out.println("Enter the third number:");
        int thirdNum = keyboard.nextInt();

        int max = firstNum;

        if (secondNumb > max) {
            max = secondNumb;
        }

        if (thirdNum > max){
            max = thirdNum;
        }

        System.out.println("The largest number is: " + max);
    }
}
