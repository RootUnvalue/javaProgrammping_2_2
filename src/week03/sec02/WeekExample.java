package week03.sec02;

import java.util.Calendar;

public class WeekExample {
    public enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Week today = null;

        Calendar calender = Calendar.getInstance();
        int week = calender.get(Calendar.DAY_OF_WEEK);

        today = switch (week) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> null;
        };

        if(today == Week.SUNDAY) {
            System.out.println("일욜에는 축구를 하다");
        } else {
            System.out.println("자바를 공부하다");
        }
    }
}
