package LambdaExpressions.GenericReference;

public class Main {
    public static void main(String[] args) {
        Integer i = 9;                                      // создается объект класса Integer
        Check<Integer> checkMyInt = Main::<Integer>isEven;  /* создается ссылка функционального интерфейса со
                                                               статическим методом, который принимает в качестве
                                                               аргумента обобщенный тип (любой тип-наследник класса
                                                               Number) */
        System.out.println(checkMyInt.check(i));            /* Предыдущая интерфейсная ссылка, созданная для
                                                               для использования в качестве аргумента объекта класса
                                                               Integer, находит свое применение для объекта i */
    }
    public static <T extends Number> boolean isEven(T ob){  /* Обобщенный метод, принимающий любого наследника класса
                                                               Number, и проверяющий его intValue на четность */
        return ( (ob.intValue() % 2) == 0);
    }
}
