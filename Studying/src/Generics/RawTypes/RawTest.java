package Generics.RawTypes;

public class RawTest {
    public static void main(String[] args) {
        String str = "amogus";
        GenericClass<Integer> IOb = new GenericClass<>(10);
        GenericClass rawOb = new GenericClass(str);
        Integer IOb2 = IOb.getOb();
        // String str2 = rawOb.getOb(); - не компилируется, т.к. инициализировано сырым типом
        String str2 = (String) rawOb.getOb(); // - работает
        System.out.println(str2);
        // Integer IOb3 = (Integer) rawOb.getOb();  - ошибка в рантайме
        // System.out.println(IOb3);
    }
}
