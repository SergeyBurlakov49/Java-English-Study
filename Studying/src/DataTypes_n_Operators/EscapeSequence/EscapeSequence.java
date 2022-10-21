package DataTypes_n_Operators.EscapeSequence;

public class EscapeSequence {
    public static void main(String[] args) {
        System.out.println("\'");       // верхняя кавычка
        System.out.println("\"");       // верхняя двойная кавычка
        System.out.println("\\");       // бэкслеш
        System.out.println("A\rB");     // возврат каретки (просто удаляет инфу перед ней, хз)
        System.out.println("A\nB");     // перевод на следующую строку
        System.out.println("A\fB");     // перевод страницы (хз, просто символ какой-то непонятный)
        System.out.println("A\tB");     // табуляция
        System.out.println("AA\bB");    // возврат на одну позицию (удаляет символ перед ней)
        System.out.println("\63");      // восьмеричная константа (хз, не выводится)
        // System.out.println("\u123"); // шестнадцатеричная константа (хз, не компилируется)
    }
}
