package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FomatiingMain1 {

    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2024, 12, 31);
        System.out.println("data = " + data);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedData = data.format(formatter);
        System.out.println("formattedData = " + formattedData);
    }
}
