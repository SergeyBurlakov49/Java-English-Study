package LambdaExpressions.ObjectMethodReference;

public class MyNumber {

    private int x;              // переменная класса, которая будет проверяться

    MyNumber (int x){
        this.x = x;             // значение присваивается через конструктор
    }

    public boolean isEven(){    // метод проверяет четность числа
        return (x % 2 == 0);
    }



}
