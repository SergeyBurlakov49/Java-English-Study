package DataTypes_n_Operators;

public class SoundCalculating {
    public static void main(String[] args) {
        lightningCalculating(9.8);
        echoesCalculating(9.8);
    }

    static void lightningCalculating (double time){
        double distance = time * 330;
        System.out.println("If time of lag between light and sound of lightning = " + time + " then distance = " + distance);
    }
    static void echoesCalculating (double time){
        double distance = (time * 330) / 2;
        System.out.println("If time of echoes = " + time + " then distance = " + distance);
    }
}
