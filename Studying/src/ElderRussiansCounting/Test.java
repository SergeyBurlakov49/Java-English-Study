package ElderRussiansCounting;

public class Test {
    public static void main(String[] args) {
        ElderRussianInteger val2 = new ElderRussianInteger(2);
        System.out.println("2 - " + val2);
        ElderRussianInteger val10 = new ElderRussianInteger(10);
        System.out.println("10 - " + val10);
        System.out.println("2 * 10 = " + val2.multiply(val10));
    }
}
