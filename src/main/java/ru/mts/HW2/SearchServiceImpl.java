package ru.mts.HW2;

import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {
    @Override
    public void checkLeapYearAnimal(LocalDate birthDate) {
        if (birthDate.isLeapYear())
            System.out.print(" - рожден в високосный год");
        else System.out.print(" - не рожден в високосный год");
    }
}