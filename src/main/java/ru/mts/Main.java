package ru.mts;

import ru.mts.HW1.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args){
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimals(12);
    }
}
