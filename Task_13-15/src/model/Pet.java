package model;

import java.time.LocalDate;
import java.util.List;

public abstract class Pet extends Animal {


    public Pet(int id, LocalDate age, String namePet, String ownerName) {
        super(id, age, namePet, ownerName);
    }

    public Pet() {
    }
}
