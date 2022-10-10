package Lambda_n_References.ObjectMethodReference.PredefinedInterfaces;

import java.util.function.UnaryOperator;

// функциональный интерфейс UnaryOperator содержит в себе метод apply, предназначенный для того, чтобы обработать
// объект некоторым образом и вернуть объект того же типа.

public class UnaryOperatorUsage {
    public static void main(String[] args) {
        UnaryOperator <String> uo = (str) -> str.toLowerCase(); /* реализация метода apply для строк, которая призвана
                                                                   переводить все символы в нижний регистр */
        System.out.println(uo.apply("Hello World"));         // использование метода для строки "Hello World"
    }
}
