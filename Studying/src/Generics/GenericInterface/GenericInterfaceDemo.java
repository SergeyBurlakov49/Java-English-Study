package Generics.GenericInterface;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        ImplementingClass <Integer> obj = new ImplementingClass<>(arr);
        System.out.println(obj.contains(5));
        System.out.println(obj.contains(6));
    }
}
