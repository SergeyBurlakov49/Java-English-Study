package Base.GalToLitTab;

public class GalToLitTab {
    public static void main(String[] args) {
        int counter = 1;
        for (int gal = 1; gal <= 100; gal++){
            System.out.println(gal + " gallons = " + gal * 3.7854 + " liters");
            counter++;
            if (counter >= 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
