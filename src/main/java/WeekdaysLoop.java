import java.util.Scanner;

public class WeekdaysLoop {
    private static Scanner keyboard;
    public static void main(String[] args) {
        System.out.println("Моля въведете число:");
        keyboard = new Scanner(System.in);
        int day = keyboard.nextInt();
        String actualDay = null;
        switch (day) {
            case 1:
                actualDay = "Понеделник";
                break;
            case 2:
                actualDay = "Вторник";
                break;
            case 3:
                actualDay = "Сряда";
                break;
            case 4:
                actualDay = "Четвъртък";
                break;
            case 5:
                actualDay = "Петък";
                break;
            case 6:
                actualDay = "Събота";
                break;
            case 7:
                actualDay = "Неделя";
                break;
            default:
                actualDay = "Невалидно въведено число";
        }
        System.out.println("Въведохте " + day + ". Следователно денят от седмицата е " + actualDay + ".");
    }
}
