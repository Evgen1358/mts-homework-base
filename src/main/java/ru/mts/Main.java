package ru.mts;

import ru.mts.HW1.CreateAnimalService;
import ru.mts.HW1.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {
    CreateAnimalService createAnimalService = new CreateAnimalService();
    createAnimalService.create10Animals();
    CreateAnimalServiceImpl createAnimalServiceimpl = new CreateAnimalServiceImpl();
    createAnimalServiceimpl.createNAnimals(2);
    createAnimalServiceimpl.createDoWhileAnimals();
    }
}
