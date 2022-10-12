package englishTranslator;

public class EnglishTranslate implements translator.Translate { /* имплементирует интерфейс Translate (это необходимо
                                                                   в рамках принципов работы системы сервисов) */

    @Override
    public String translate(String str) {                       // бессмысленная реализация метода интерфейса translate
        if (str.equals("Строка")){
            return "String";
        }
        else return "i don't know this word.";
    }
}
