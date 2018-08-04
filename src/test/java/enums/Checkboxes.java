package enums;

import java.util.List;

public enum Checkboxes {
    ORDER_1(" order 1 "),
    ORDER_2(" order 2 "),
    ORDER_3(" order 3 "),
    ORDER_4(" order 4 ");

    private String description;

    Checkboxes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Checkboxes[] getAllValues(){
        return Checkboxes.values();
    }
}
