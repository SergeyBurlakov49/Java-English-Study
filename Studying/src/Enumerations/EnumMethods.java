package Enumerations;

public class EnumMethods {
    public static void main(String[] args) {
        CatBreeds cb [] = CatBreeds.values();                    // возвращает массив объектов типа CatBreeds
        CatBreeds cb1 = CatBreeds.valueOf("MAINE_COON");    // находит объект типа перечисления по строке
        System.out.println(cb1);
        System.out.println(cb1.ordinal());                       // возвращает id объекта перечисления
        System.out.println(cb1.compareTo(CatBreeds.MAINE_COON)); // сравнивает id
    }
}
