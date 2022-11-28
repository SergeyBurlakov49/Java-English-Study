package Enumerations.Colors;

public class ColorsDemo {
    public static void main(String[] args) {
        for (Colors color:Colors.values()){
            System.out.println(color.getCode() + color.toString().toLowerCase() + " text.");
        }
    }
}
