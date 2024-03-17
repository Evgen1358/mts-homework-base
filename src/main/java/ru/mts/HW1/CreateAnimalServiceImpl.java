package ru.mts.HW1;

import java.util.Random;

public class CreateAnimalServiceImpl {
    public void createNAnimals(Integer num){
        System.out.print("\n\n\nHome Work #1. Part2. (N Animals)\n");
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
