package Lambda_n_References;

public class ConstReference {
    public static void main(String[] args) {
        Create obj = A::new;                    /* создается ссылка функционального интерфейса, содержащего в сигнатуре
                                                   своего метода строку */
        obj.m1("Constructor with args");    /* реализуется метод m1 через конструктор класса А. Строка будет
                                                   выведена посредством логики конструктора */
    }
}

class A{
    public A(String str){                       // конструктор, выводящий строку из аргумента во время выполнения
        System.out.println(str);
    }
}

@FunctionalInterface
interface Create{
    void m1(String str);                        // функциональный интерфейс с методом, принимающим строку
}
