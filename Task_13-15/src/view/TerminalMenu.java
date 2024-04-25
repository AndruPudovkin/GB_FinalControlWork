package view;

import java.util.SortedMap;

public class TerminalMenu {

    private int numMenu;
    public TerminalMenu() {}

    public void mainMenu(){
        System.out.println("              -Main menu- " +"\n" +
                            "Для навигации введите в терминал номер пункта меню:"+"\n"+
                            "1 - Вывести список всех животных в питомнике"+"\n"+
                            "2 - Добавить новое животное" + "\n" +
                            "3 - Определить вид животного по id"+ "\n" +
                            "4 - Посмотреть список команд животного по id" +"\n" +
                            "5 - Обучить жывотное новой команде по id " +"\n" +
                            "6 - Завершение работы" );
    }
    public int getNumMenu() {
        return numMenu;
    }

    public void createAnimal(){
        System.out.println( "              -Create animal menu- " +"\n" +
                "Вы можете создать животных типа: "+"\n"+
                "1 - Собака"+"\n"+
                "2 - Кошка" + "\n" +
                "3 - Хомяк"+ "\n" +
                "4 - Лошадь" +"\n" +
                "5 - Верблюд" +"\n" +
                "6 - Ослик" +"\n" );
    }



    public void setNumMenu(int numMenu) {
        this.numMenu = numMenu;
    }



}
//return "Animal{" +
//        "id=" + id +
//        ", age=" + age +
//        ", namePet='" + namePet + '\'' +
//        ", ownerName='" + ownerName + '\'' +
//        '}';