package LambdaExpressions.ObjectMethodReference.SameThingButForDifferentObjects;

public class MyNumber {

    private int x; // переменная класса, которая будет проверяться

    MyNumber (int x){ // значение присваивается через конструктор
        this.x = x;
    }

    public boolean isEven(){
        return ((x % 2) == 0);
    }
}
