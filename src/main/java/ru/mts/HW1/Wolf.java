package ru.mts.HW1;

public class Wolf extends Predatory{
    public void printWolf(){
        setName("Волк");
        setPredatory();
        System.out.print("\nНазвание: " + getName());
        System.out.print(". Группа питания: " + getGroup());
        System.out.print(". Характер: " + getCharacter());
        System.out.print(". Возможность одомашнивания: " + getPet().toString());
    }
}
