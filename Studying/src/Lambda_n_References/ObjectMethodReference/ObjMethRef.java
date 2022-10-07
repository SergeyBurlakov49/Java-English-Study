package Lambda_n_References.ObjectMethodReference;

public class ObjMethRef {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(10); // создание объекта класса MyNumber со значением приватной переменной 10
        Check checkEvenMyNum = myNumber::isEven; /* создание интерфейсной ссылки, которая использует предыдущий объект
                                                    для выполнения метода check, реализованного посредством метода
                                                    isEven */
        System.out.println(checkEvenMyNum.check()); /* Вывод в консоль булевой переменной, возвращаемой методом check,
                                                       реализованным посредством интерфейсной ссылки checkEvenMyNum,
                                                       которая представляет собой использование метода isEven для
                                                       приватной переменной объекта класса MyNumber */
    }
}
class MyNumber {
    private int x;              // переменная класса, которая будет проверяться
    MyNumber (int x){
        this.x = x;             // значение присваивается через конструктор
    }
    public boolean isEven(){    // метод проверяет четность числа
        return (x % 2 == 0);
    }
}
@FunctionalInterface
interface Check {
    boolean check(); // Проверяет число на соблюдение какого-либо условия
}
