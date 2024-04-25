package servise;

import model.Animal;

public interface AnimalServise {

    public void addAnimal(Animal animal);
    public void getAllAnimal();
    public void whoIs(int id);
    public void getAllCommandsAnimal(int id);
    public void setCommandFoAnimal(int id, String command);
}
