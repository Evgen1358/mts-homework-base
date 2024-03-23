package ru.mts.HW1;

import ru.mts.HW2.InvalidAnimalException;

public interface CreateAnimalService {
    void createAnimals(Integer num) throws InvalidAnimalException;
}
