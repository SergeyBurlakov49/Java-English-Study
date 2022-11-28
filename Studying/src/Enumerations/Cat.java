package Enumerations;

public class Cat {
    CatBreeds breed;
    int age;
    int weight;

    public Cat(CatBreeds breed, int age, int weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Cat(CatBreeds breed, int weight) {
        this.breed = breed;
        age = 0;
        this.weight = weight;
    }

    static public Cat getRandomCat(){
        return new Cat(getRandomBreed(), getRandomAge(), getRandomWeight());
    }

    static private int getRandomWeight(){
        return (int) Math.round ( Math.random() * 10 );
    }

    static private int getRandomAge(){
        return (int) Math.round ( Math.random() * 15 );
    }

    static private CatBreeds getRandomBreed(){
        int count = (int) Math.round ( Math.random() * (CatBreeds.values().length - 1) );
        return CatBreeds.values()[count];
    }
}
