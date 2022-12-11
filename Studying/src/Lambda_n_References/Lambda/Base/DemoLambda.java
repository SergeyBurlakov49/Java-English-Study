package Lambda_n_References.Lambda.Base;

public class DemoLambda {
    public static void main(String[] args) {
        GetNum getP = () -> 3.141592653;
        double area = (Math.pow(5.0, 2.0) * getP.getNum());
        System.out.println(area);                           // как я жил без таких возможностей...
    }
}
