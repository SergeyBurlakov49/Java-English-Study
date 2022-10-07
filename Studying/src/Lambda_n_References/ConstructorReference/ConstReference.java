package Lambda_n_References.ConstructorReference;

public class ConstReference {
    public static void main(String[] args) {
        Create obj= A::new;
        obj.m1();
    }
}

class A{
    A(){
        System.out.println("HW");
    }
}

@FunctionalInterface
interface Create{
    void m1();
}
