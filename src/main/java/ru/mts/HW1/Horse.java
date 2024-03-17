package ru.mts.HW1;

public class Horse extends Herbivorous{
    public void printHorse(){
        setName("Лошадь");
        setHerbivorous();
        System.out.print("\nНазвание: " + getName());
        System.out.print(". Группа питания: " + getGroup());
        System.out.print(". Характер: " + getCharacter());
        System.out.print(". Возможность одомашнивания: " + getPet().toString());
    }
}
