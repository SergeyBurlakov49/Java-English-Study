package Packages_n_Interfaces.Interfaces;

public class Human implements SayI{

    String name;

    public Human(String name){
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Hello, my name is " + name);
    }
}
