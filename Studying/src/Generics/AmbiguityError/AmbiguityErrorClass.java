package Generics.AmbiguityError;

public class AmbiguityErrorClass <T, V> {

    T Tob;
    V Vob;

    public AmbiguityErrorClass(T Tob, V Vob){
        this.Tob = Tob;
        this.Vob = Vob;
    }

//    public boolean compare(T ob){
//        return ob == Tob;
//    }
//
//    public boolean compare(V ob){
//        return ob == Vob;
//    }
}
