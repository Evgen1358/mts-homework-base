package ru.mts.HW1;

public class Shark extends Predatory{
    public void printShark(){
        setName("Акула");
        setPredatory();
        System.out.print("\nНазвание: " + getName());
        System.out.print(". Группа питания: " + getGroup());
        System.out.print(". Характер: " + getCharacter());
        System.out.print(". Возможность одомашнивания: " + getPet().toString());
    }
}
