package renting;

/**
 * Created by Ильдар on 24.11.2014.
 */
public enum Period {

    HOUR("Час"),
    DAY("Сутки"),
    WEEK("Неделя"),
    MONTH("Месяц"),
    YEAR("Год");

    private String title;

    Period(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
