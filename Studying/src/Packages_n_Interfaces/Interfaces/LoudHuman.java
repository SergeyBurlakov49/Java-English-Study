package Packages_n_Interfaces.Interfaces;

public class LoudHuman implements ShoutI{

    public String name;

    public LoudHuman(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public void shout() {
        String introduce = ("Hello, my name is " + name);
        System.out.println(introduce.toUpperCase());
    }
}
