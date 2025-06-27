package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {

        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        LocalDate currentDay = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDay.plus(period);
        System.out.println("currentDay = " + currentDay);
        System.out.println("plusDate = " + plusDate);

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between);
    }
}
