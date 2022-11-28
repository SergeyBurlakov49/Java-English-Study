package Generics.RawTypes;

public class GenericClass <T> {

    public T ob;

    public GenericClass(T ob){
        this.ob = ob;
    }

    public T getOb(){
        return ob;
    }

}
