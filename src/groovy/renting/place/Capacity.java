package renting.place;

/**
 * Created by Ильдар on 24.11.2014.
 */
public enum Capacity {
    LESS_TEN("До 10 человек"),
    FROM_TEN_TO_TWENTY("От 10 до 20 человек"),
    FROM_TWENTY_TO_FIFTY("От 20 до 50 человек"),
    FROM_FIFTY_TO_ONEHUNDRED("От 50 до 100 человек"),
    MORE_ONEHUNDRED("Больше 100 человек");

    private String title;

    Capacity(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
