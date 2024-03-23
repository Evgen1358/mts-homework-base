package ru.mts.HW2;

public class InvalidAnimalException extends NullPointerException {
    public InvalidAnimalException(String s) {
        super(s);
        System.out.println("\n" + s);
    }
}
