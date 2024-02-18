import java.util.Scanner;

public class perimeterAndFaceOfRectangle {
private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Въведете височината на правоъгълника:");
        int height = keyboard.nextInt();

        while (height <= 0) {
            System.out.println("Въведете положително число!");
            height = keyboard.nextInt();
        }

        System.out.println("Въведете широчината на правоъгълника:");
        int lenght = keyboard.nextInt();

        while (lenght <= 0) {
            System.out.println("Въведете положително число!");
            lenght = keyboard.nextInt();
        }

        int perimeter = 2 * (height + lenght);
        int area = height * lenght;

        System.out.println("Периметърът е: " + perimeter);
        System.out.println("Лицето е: " + area);
    }
}
