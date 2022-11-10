package Inheritance.getClass;

public class getClassTest {
    public static void main(String[] args) {
        getClassTest gct = new getClassTest();
        Class obj = gct.getClass();
        System.out.println(obj);
        String str = obj.toString();
        System.out.println(str);
    }
}
