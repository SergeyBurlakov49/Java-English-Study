package LambdaExpressions.ObjectMethodReference.SameThingButForDifferentObjects;

public class STBFDO_MyNumber {

    private int x;                      // переменная класса, которая будет проверяться

    STBFDO_MyNumber(int x){             // значение присваивается через конструктор
        this.x = x;
    }

    public boolean isEven(){            // метод проверяет четность числа
        return ((x % 2) == 0);
    }
}
