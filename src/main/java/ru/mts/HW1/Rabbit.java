package ru.mts.HW1;

import ru.mts.HW2.InvalidAnimalException;
import ru.mts.HW2.SearchService;
import ru.mts.HW2.SearchServiceImpl;
import ru.mts.HW2.SetYear;

import java.io.IOException;
import java.time.LocalDate;

public class Rabbit extends Herbivorous {
    public void printRabbit() {
        setName("Кролик");
        setYear(new SetYear().SetYear());
        setHerbivorous();
        System.out.print("\nНазвание: " + getName());
        System.out.print(". Группа питания: " + getGroup());
        System.out.print(". Характер: " + getCharacter());
        System.out.print(". Возможность одомашнивания: " + getPet().toString());
        System.out.print(". Дата рождения: " /*+ getYear().toString()*/);
        SearchService searchService = new SearchServiceImpl();
        LocalDate nll = null;
        try {
            searchService.checkLeapYearAnimal(nll);
        } catch (NullPointerException e) {
            String ex = String.format("у животного %s не указана дата его рождения", name);
            System.out.println("\n" + ex);
        }
    }
}
