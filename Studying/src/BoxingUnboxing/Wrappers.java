package BoxingUnboxing;

public class Wrappers {
    public static void main(String[] args) {
        String str = "1488.47";
//      Double d = new Double(str); конструктор почему-то считается тухлым
        Double d = Double.parseDouble(str);
        System.out.println(d);
        int i = 10;
        printInteger(i);
        printInteger(14);
        Integer I = 15;
        int x = i + I;
        System.out.println(x);


    }

    public static void printInteger(Integer i){
        System.out.println(i);
    }
}
