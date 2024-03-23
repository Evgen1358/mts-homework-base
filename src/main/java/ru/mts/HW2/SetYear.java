package ru.mts.HW2;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Random;

public class SetYear {
    public LocalDate SetYear() {
        int minYear = 1980;
        int maxYear = 2024;
        int minMonth = 1;
        int maxMonth = 12;
        int minDay = 1;
        int maxDay = 31;
        Random random = new Random();
        int year = random.nextInt(minYear, maxYear);
        int month = random.nextInt(minMonth, maxMonth);
        if (month == 2) maxDay = 28;
        if (month == 4 || month == 6 || month == 9 || month == 11) maxDay = 30;
        int day = random.nextInt(minDay, maxDay);
        String rDate = year + "-" + month + "-" + day;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-M-d");
        return LocalDate.parse(rDate, format);
    }
}
