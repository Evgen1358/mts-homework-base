package ru.mts.HW1;

public class Rabbit extends Herbivorous{
    public void printRabbit(){
        setName("Кролик");
        setHerbivorous();
        System.out.print("\nНазвание: " + getName());
        System.out.print(". Группа питания: " + getGroup());
        System.out.print(". Характер: " + getCharacter());
        System.out.print(". Возможность одомашнивания: " + getPet().toString());
    }
}
