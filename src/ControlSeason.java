import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ControlSeason {

    private static String userSelection() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj porę roku:");
        System.out.println(Arrays.toString(Season.getSeasonsTranslated()));
        String userChoice = scan.nextLine();
        return userChoice;
    }

    public static void printMonths(HashMap<Season, String[]> map) {
        Season season1 = Season.convertFromString(userSelection());
        System.out.println("Miesiące należące do tego sezonu:");
        String[] miesiace = map.get(season1);
        System.out.println(Arrays.toString(miesiace));
    }
}
