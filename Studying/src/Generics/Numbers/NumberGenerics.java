package Generics.Numbers;

public class NumberGenerics <T extends Number>{

    T num;

    public NumberGenerics(T ob){
        this.num = ob;
    }

    public int sum(NumberGenerics ob){
        if (ob == null){

            return 0;
        }
        return (int) (this.num.doubleValue() + ob.num.doubleValue());
    }
}
