package Packages_n_Interfaces.Interfaces;

public class Cat implements SayI{

    String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }

    public void sleep(){
        System.out.println("ZzZ...");
    }
}
