package Enumerations;

@Deprecated
public class Demo_amogus {
    public static void main(String[] args) {
        Cat cat = new Cat(CatBreeds.MAINE_COON, 5);
        switch (cat.breed){
            case SPHYNX:
                System.out.println("There is a sphynx");
                break;
            case MAINE_COON:
                System.out.println("There is a maine coon");
                break;
            case AMERICAN_SHORTHAIR:
                System.out.println("There is a american shorthair");
                break;
            case PERSIAN:
                System.out.println("There is a persian");
                break;
            default:
                System.out.println("Я хочу быть счастливым!");
                break;
        }
    }
}
