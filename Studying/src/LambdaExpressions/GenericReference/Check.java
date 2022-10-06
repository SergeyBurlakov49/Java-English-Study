package LambdaExpressions.GenericReference;

@FunctionalInterface
public interface Check <T extends Number>{
    boolean check(T ob);    // некоторый метод check, принимающий в качестве аргумента любого наследника класса Number
}
