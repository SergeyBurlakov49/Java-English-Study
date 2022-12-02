package IO.Serialization;

import java.io.Serializable;

public class Human implements Serializable {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return (name +  ", " + age);
    }
}
