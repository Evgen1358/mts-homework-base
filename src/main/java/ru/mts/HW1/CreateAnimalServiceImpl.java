package ru.mts.HW1;

import ru.mts.HW2.InvalidAnimalException;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService{

    @Override
    public void createAnimals(Integer num) throws InvalidAnimalException {
        System.out.print("\n\n\nHome Work #2. Part1. (add Birthday & check for leapYear)\n");
        Wolf wolf = new Wolf();
        Shark shark = new Shark();
        Rabbit rabbit = new Rabbit();
        Horse horse = new Horse();
        Random random = new Random();
        String[] names = {"Wolf", "Shark", "Rabbit", "Horse"};
        for (int i = 0; i < num; i++) {
            String name = names[random.nextInt(names.length)];
            if (name.equals("Wolf")) wolf.printWolf();
            if (name.equals("Shark")) shark.printShark();
            if (name.equals("Rabbit")) rabbit.printRabbit();
            if (name.equals("Horse")) horse.printHorse();
        }
    }
}
