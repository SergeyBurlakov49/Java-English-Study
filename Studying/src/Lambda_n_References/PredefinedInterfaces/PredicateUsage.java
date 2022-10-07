package Lambda_n_References.PredefinedInterfaces;

import java.util.function.Predicate;

// функциональный интерфейс Predicate принимает объект любого класса, проверяет его на некое условие и возвращает bool

public class PredicateUsage {
    public static void main(String[] args) {
        Predicate<Integer> pobj = (i) -> (i % 2) == 0;  // лямбда-выражение для проверки Integer на четность
        Integer i = 10;                                 // инициализация объекта класса Integer
        System.out.println(pobj.test(i));               //вывод результата проверки в окнсоль
    }
}
