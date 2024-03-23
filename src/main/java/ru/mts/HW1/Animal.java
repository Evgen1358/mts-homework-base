package ru.mts.HW1;

import java.time.LocalDate;

public interface Animal {
    String getGroup();
    String getName();
    Boolean getPet();
    String getCharacter();
    LocalDate getYear();
}