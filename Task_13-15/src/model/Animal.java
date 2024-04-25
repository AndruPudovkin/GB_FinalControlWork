package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public abstract class Animal {
    private int id;
    private LocalDate age;
    private String namePet;
    private String ownerName;
    private List<String> listCommands;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Animal(int id, LocalDate age, String namePet, String ownerName) {
        this.id = id;
        this.age = age;
        this.namePet = namePet;
        this.ownerName = ownerName;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", age=" + age +
                ", namePet='" + namePet + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public List<String> getListCommands() {
        return listCommands;
    }

    public void setListCommands(List<String> listCommands) {
        this.listCommands = listCommands;
    }
}
