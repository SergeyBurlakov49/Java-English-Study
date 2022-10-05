package LambdaExpressions.ObjectMethodReference.SameThingButForDifferentObjects;

public class STBFDO_Main {
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
