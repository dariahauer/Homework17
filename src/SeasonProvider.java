public class SeasonProvider {
    public static void main(String[] args) {

        try {

            SeasonMonths seasonMonths = new SeasonMonths();
            ControlSeason controlSeason = new ControlSeason();
            controlSeason.printMonths(seasonMonths.getMonths());
        } catch (IllegalArgumentException ex) {
            System.err.println("Niepoprawne dane");
        }

    }
}