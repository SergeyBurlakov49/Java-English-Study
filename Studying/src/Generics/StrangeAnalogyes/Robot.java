package Generics.StrangeAnalogyes;

public class Robot <T extends Head>{

    public T head;
    public Body body;

    public Robot(T head, Body body) {
        this.head = head;
        this.body = body;
    }
}
