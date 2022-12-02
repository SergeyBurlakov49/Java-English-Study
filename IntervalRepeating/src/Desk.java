import java.io.Serializable;
import java.util.ArrayList;

public class Desk implements Serializable {

    CurvePoint [] curvePoints;
    String name;

    public Desk(Curve curve, String name){
        curvePoints = new CurvePoint[curve.curvePoints.size()];
        this.name = name;
        curve.curvePoints.toArray(curvePoints);
    }

    public static void main(String[] args)  {
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }

}
