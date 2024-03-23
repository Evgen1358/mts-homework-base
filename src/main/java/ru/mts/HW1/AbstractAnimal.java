package ru.mts.HW1;

import java.time.LocalDate;

public class AbstractAnimal implements Animal{
    protected String group; //группа питания
    protected String name; //имя
    private Boolean pet; //возможность одомашнивания
    protected String character; //характер
    protected LocalDate birthDate; //дата рождения

    // геттеры
    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Boolean getPet() {
        return pet;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getYear() {
        return birthDate;
    }

    // сеттеры
    public void setPet(Boolean pet) {
        this.pet = pet;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setCharacter(String character) {
        this.character = character;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
