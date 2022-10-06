package Lambda_n_References.ObjectMethodReference.SameThingButForDifferentObjects;

public class SObjMethRef {
    public static void main(String[] args) {
        STBFDO_MyNumber myNumber = new STBFDO_MyNumber(10); /* Объявляется объект класса STBFDO_MyNumber со
                                                                  значением приватной переменной = 10 */
        STBFDO_Check checkMyNumber = STBFDO_MyNumber::isEven;  /* Создается интерфейсная ссылка, использующая любой
                                                                  объект класса STBFDO_MyNumber для реализации метода
                                                                  check через метод isEven */
        System.out.println(checkMyNumber.check(myNumber));     /* Вывод на консоль реализации метода check через
                                                                  метод isEven для объекта myNumber, что воплощено при
                                                                  помощи интерфейсной ссылки checkMyNumber*/
    }
}

interface STBFDO_Check {
    boolean check(STBFDO_MyNumber myNumber);    /* Проверяет число на соблюдение какого-либо условия
                                                   Стоит обратить внимание на то, что метод принимает
                                                   объект класса STBFDO_MyNumber*/
}

class STBFDO_MyNumber {

    private int x;                      // переменная класса, которая будет проверяться

    STBFDO_MyNumber(int x){             // значение присваивается через конструктор
        this.x = x;
    }

    public boolean isEven(){            // метод проверяет четность числа
        return ((x % 2) == 0);
    }
}
