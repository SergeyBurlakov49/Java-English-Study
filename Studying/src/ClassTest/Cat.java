package ClassTest;

public class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
        age = 0;
    }

    public void say(){
        System.out.println("meow");
    }
}
