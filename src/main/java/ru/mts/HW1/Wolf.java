package ru.mts.HW1;

import ru.mts.HW2.SearchService;
import ru.mts.HW2.SearchServiceImpl;
import ru.mts.HW2.SetYear;

public class Wolf extends Predatory{
    public void printWolf(){
        setName("Волк");
        setYear(new SetYear().SetYear());
        setPredatory();
        System.out.print("\nНазвание: " + getName());
        System.out.print(". Группа питания: " + getGroup());
        System.out.print(". Характер: " + getCharacter());
        System.out.print(". Возможность одомашнивания: " + getPet().toString());
        System.out.print(". Дата рождения: " + getYear().toString());
        SearchService searchService = new SearchServiceImpl();
        searchService.checkLeapYearAnimal(birthDate);
    }
}
