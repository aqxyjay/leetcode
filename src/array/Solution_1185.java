package array;

import java.time.LocalDate;

public class Solution_1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekdays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        LocalDate date = LocalDate.of(year, month, day);
        int dayOfWeek = date.getDayOfWeek().getValue();
        return weekdays[dayOfWeek - 1];
    }
}
