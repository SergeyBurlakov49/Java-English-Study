package Inheritance.Base;

abstract public class Animal {
    private int weight;
    private int height;

    public Animal(int weight, int height){
        this.weight = weight;
        this.height = height;
    }

    protected Animal(Animal ob){
        weight = ob.weight;
        height = ob.height;
    }

    abstract void say();

    final public int getWeight() {
        return weight;
    }

    final public void setWeight(int weight) {
        this.weight = weight;
    }

    final public int getHeight() {
        return height;
    }

    final public void setHeight(int height) {
        this.height = height;
    }

    final public void showHeight(){
        System.out.println("height = " + height);
    }

    final public void showWeight(){
        System.out.println("weight = " + weight);
    }

    public void show(){
        System.out.println("weight = " + weight);
        System.out.println("height = " + height);
    }
}

final class Cat extends Animal implements Cloneable{
    String breed;

    @Override
    void say() {
        System.out.println("Meow");
    }

    public Cat(int weight, int height, String breed){
        super(weight, height);
        this.breed = breed;
    }

    protected Cat(Cat ob){
        super(ob);
        breed = ob.breed;
    }

    public void showBreed(){
        System.out.println("Breed - " + breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void show(){
        System.out.println("Breed - " + breed);
        System.out.println("weight = " + getWeight());
        System.out.println("height = " + getHeight());
    }
    public Cat clone(){
        return new Cat(this);
    }
}
class Demo {
    public static void main(String[] args) {
//        Animal a;                                        т.е ссылка суперкласса с объектом подкласса может использо -
//      a = new Cat(10,10,"amogus");                       вать только члены суперкласса, но в случае с переопределением
//      a.showHeight();                                 // метода будет использовать метод подкласса. Че ваще...
//      a.show();
//      a.say();
        Cat c = new Cat(8, 8, "sus");
        Cat c2 = c.clone();
        c.setBreed("bebra");
        c.show();
        c2.show();
        //a = new Animal(10,10);
        //a.show();

        //a.showBreed();

    }
}
