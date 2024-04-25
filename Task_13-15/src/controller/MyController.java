package controller;

import model.*;
import servise.AnimalServise;
import servise.AnimalServiseImpl;
import view.TerminalMenu;

import javax.script.ScriptEngine;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MyController {
   private AnimalServise animalServise = new AnimalServiseImpl( new ArrayList<>());
   private TerminalMenu terminalMenu = new TerminalMenu();
   private Counter counter = new Counter();





    public MyController( ) {

    }

    // вывод всех животных
    public void getAllAnimal(){
        animalServise.getAllAnimal();
    }

    public void addAnimal(){
        terminalMenu.createAnimal();
        Scanner scanner = new Scanner(System.in);
        int crateNum = scanner.nextInt();
        System.out.println("Введите id животного: ");
        int id = scanner.nextInt();
        System.out.println("Введите возраст животного (гггг-мм-дд): ");
        LocalDate age = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("Введите кличку животного: ");
        String namePet = scanner.next();
        System.out.println("Введите имя хозяина: ");
        String ownerName = scanner.next();
        switch (crateNum){
            case 1:
                Dog dog = new Dog(id, age, namePet, ownerName);
                animalServise.addAnimal(dog);
                break;
            case 2:
                Cat cat = new Cat(id, age, namePet, ownerName);
                animalServise.addAnimal(cat);
            case 3:
                Hamster hamster = new Hamster(id, age, namePet, ownerName);
                animalServise.addAnimal(hamster);
                break;
            case 4:
                Horse horse = new Horse(id, age, namePet, ownerName);
                animalServise.addAnimal(horse);
                break;
            case 5:
                Camel camel = new Camel(id, age, namePet, ownerName);
                animalServise.addAnimal(camel);
                break;
            case 6:
                Dankey dankey = new Dankey(id, age, namePet, ownerName);
                animalServise.addAnimal(dankey);
                break;
        }
    }



    public void startController(){
        Scanner scanner = new Scanner(System.in);
        terminalMenu.mainMenu();
        while (terminalMenu.getNumMenu() != 6){
            System.out.println("ожидаем номер пункта ....");
            terminalMenu.setNumMenu(scanner.nextInt());
            switch (terminalMenu.getNumMenu()){
                case 1:
                    getAllAnimal();
                    break;
                case 2:
                    counter.add();
                    addAnimal();
                    break;
                case 3:
                    System.out.println("Введите id животного: ");
                    animalServise.whoIs(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Введите id животного: ");
                    animalServise.getAllCommandsAnimal(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Введите id животного: ");
                    int id = scanner.nextInt();
                    System.out.println("Ведите команду, которой хотите обучить");
                    animalServise.setCommandFoAnimal(id, scanner.next());
                    break;
                case 7:
                    System.out.println(counter.getCount());
                    break;


            }

        }
    }
}
