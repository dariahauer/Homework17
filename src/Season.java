public enum Season {
    SPRING("Wiosna"),
    SUMMER("Lato"),
    AUTUMN("Jesień"),
    WINTER("Zima");

    private final String monthPL;


    Season(String monthPL) {
        this.monthPL = monthPL;
    }

    static Season convertFromString(String userSeason) {
        Season[] seasons = values();
        for (Season season : seasons) {
            if (season.getMonthPL().equalsIgnoreCase(userSeason)) {
                return season;
            }
        }
        throw new IllegalArgumentException("value not found");
    }

    static String[] getSeasonsTranslated() {
        Season[] seasons = values();
        String[] translatedTable = new String[seasons.length];
        int i = 0;
        for (Season season : seasons) {
            translatedTable[i] = season.getMonthPL();
            i++;
        }
        return translatedTable;
    }

    public String getMonthPL() {
        return monthPL;
    }
}
