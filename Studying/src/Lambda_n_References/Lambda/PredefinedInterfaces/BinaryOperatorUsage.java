package Lambda_n_References.Lambda.PredefinedInterfaces;

import java.util.function.BinaryOperator;

// функциональный интерфейс BinaryOperator служит для использования в качестве аргументов двух объектов одного типа и
// возврат того же типа

public class BinaryOperatorUsage {
    public static void main(String[] args) {
        BinaryOperator<Integer> bo = (Integer a, Integer b) ->  a + b;  /* лямбда выражение, дающее значение Integer -
                                                                       объекту значение суммы двух объектов этого типа*/
        Integer i = bo.apply(20, 30); // присвоение объекту типа Integer суммы 20 и 30
        System.out.println(i);             // вывод значения в консоль
    }
}


