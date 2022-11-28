package Generics.GenericConstructor;

public class GenericConstructor {

    int sum;

    <T extends Number> GenericConstructor(T num) {
        for(int i = 0; i <= num.intValue(); i++){
            sum += i;
        }
    }

    int getSum(){
        return sum;
    }
}
