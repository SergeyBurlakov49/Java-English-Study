package LambdaExpressions.ObjectMethodReference;
import LambdaExpressions.ObjectMethodReference.MyNumber.*;

public class Main {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(10); // создание объекта класса MyNumber со значением приватной переменной 10

        Check checkEvenMyNum = myNumber::isEven; /* создание интерфейсной ссылки, которая использует предыдущий объект
                                                    для выполнения метода check, реализованного посредством метода
                                                    isEven */

        System.out.println(checkEvenMyNum.check()); /* Вывод в консоль булевой переменной, возвращаемой методом check,
                                                       реализованным посредством интерфейсной ссылки checkEvenMyNum,
                                                       которая представляет собой использование метода isEven для
                                                       приватной переменной объекта класса MyNumber*/
    }
}
