package model;

import java.time.LocalDate;
import java.util.List;

public abstract class PackAnimak extends Animal {

    public PackAnimak(int id, LocalDate age, String namePet, String ownerName) {
        super(id, age, namePet, ownerName);
    }

}
