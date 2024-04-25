package model;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(int id, LocalDate age, String namePet, String ownerName) {
        super(id, age, namePet, ownerName);
    }

    public Dog() {
    }
}
