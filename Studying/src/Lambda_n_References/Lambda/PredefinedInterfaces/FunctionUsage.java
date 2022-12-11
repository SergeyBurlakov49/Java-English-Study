package Lambda_n_References.Lambda.PredefinedInterfaces;

import java.util.function.Function;

// функциональный интерфейс Function получает объект типа T, а возвращает объект типа R.

public class FunctionUsage {
    public static void main(String[] args) {
        Function<Integer, Double> convert = (i) -> i.doubleValue(); /* я решил воспользоваться этим интерфейсом
                                                                       в качестве конвертера из Integer в Double */
        Integer i = 10; // инициализация объекта типа Integer
        Double d = convert.apply(i); // получение объекта типа Double при помощи написанного ранее интефейса
        System.out.println(d); // вывод значения объекта в консоль
    }
}
