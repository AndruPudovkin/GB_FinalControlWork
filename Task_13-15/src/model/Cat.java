package model;

import java.time.LocalDate;

public class Cat extends Pet{
    public Cat(int id, LocalDate age, String namePet, String ownerName) {
        super(id, age, namePet, ownerName);
    }
}
