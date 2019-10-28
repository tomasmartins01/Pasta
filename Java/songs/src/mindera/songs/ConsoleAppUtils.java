package mindera.songs;
import java.util.*;

public class ConsoleAppUtils {
    public static final Scanner KEYBOARD = new Scanner(System.in);

    public static int printMenu(String[] optionsText) {
        for(int i=0; i < optionsText.length; ++i) {
            System.out.println((i+1) + " - " + optionsText[i]);
        }
        return KEYBOARD.nextInt();
    }

    public static String askString(String fieldName) {
        System.out.println(fieldName + "?");
        return KEYBOARD.next();
    }

    public static int askInt(String fieldName) {
        System.out.println(fieldName + "?");
        return KEYBOARD.nextInt();
    }

    public static float askFloat(String fieldName) {
        System.out.println(fieldName + "?");
        return KEYBOARD.nextFloat();
    }
}