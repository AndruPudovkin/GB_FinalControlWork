package servise;

import model.Animal;
import model.Cat;
import model.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.SortedMap;

public class AnimalServiseImpl implements AnimalServise{
    private  List<Animal> animalList;

    public AnimalServiseImpl(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }
    public void getAllAnimal(){
        for (Animal a: animalList) {
            System.out.println(a);
        }
    }


    public void whoIs(int id){
        for (Animal animal: animalList) {
            if (animal.getId() == id) {
                System.out.println(animal.getClass());
            }
        }
    }

    public void setCommandFoAnimal(int id, String command){
        for (Animal animal:animalList) {
            if (animal.getListCommands() == null) {
                List<String> commands = new ArrayList<>();
                commands.add(command);
                animal.setListCommands(commands);
            } else animal.getListCommands().add(command);
        }
    }

    public void getAllCommandsAnimal(int id){
        for (Animal animal: animalList){
            if(animal.getId() == id) {
                System.out.println(animal.getListCommands());
            }
        }
    }
    public void getPetCommandsAnimal(Object o){
        for (Animal animal: animalList){
            if (animal.getClass() == o.getClass()) {
                System.out.println(animal.getListCommands());
            }
        }
    }




}
