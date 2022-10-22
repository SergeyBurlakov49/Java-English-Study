package Lambda_n_References.PredefinedInterfaces;

import java.util.function.Consumer;

// функциональный интерфейс принимает в себя объект некоторого типа и выполняет какие-либо операции, ничего не возвращая

public class ConsumerUsage {
    public static void main(String[] args) {
        Consumer<Integer> cobj = (a) -> {   // реализация метода accept посредством лямбда выражения, проверяющего
            if ((a % 2) == 0) System.out.println("Number is even");    // объект типа Integer на четность
            else System.out.println("Number isn't even");
        };
        cobj.accept(9); // вывод результата в консоль
    }
}
