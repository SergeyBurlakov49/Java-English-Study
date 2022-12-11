package Generics.WildCards;

import java.util.*;

public class WildcardsDemo {
    public static void main(String[] args) {
        List<Computer> list = new ArrayList<>();    // пока не изучал collections, это вроде че то типа массива
        list.add(new Computer());
        list.add(new Notebook());
        turnOffComputers(list);
    }
    public static void turnOffComputers(List<? extends Computer> list){
        for (Computer computer:list){
            computer.turnOff();
        }
    }
}
