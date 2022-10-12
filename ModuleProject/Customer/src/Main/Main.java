package Main;

import englishTranslator.EnglishTranslate;

// суть данной программы - использование модулей, в частности - модульных служб и провайдеров

public class Main {
    public static void main(String[] args) {                    // главный метод программы
        EnglishTranslate engTrans = new EnglishTranslate();     // создание объекта класса, реализующего службу
        System.out.println(engTrans.translate("Строка"));   // проверка работоспособности написанной логики
        System.out.println(engTrans.translate("Собака"));
    }
}
