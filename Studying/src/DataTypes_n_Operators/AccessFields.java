package DataTypes_n_Operators;

public class AccessFields {
    public static void main(String[] args) {
        // int y = x;       - не скомпилируется, т.к. x вне поля действия
        int y = 10;
        if(true){
            y++;         // - скомпилируется, т.к. y во внешней области
            int z = 5;
            // int y = 20   - не скомпилируется, т.к. y обьявлена во внешней области
        }
        // y = z;           - не скомпилируется, т.к. z во внутренней области
    }
    static void foometh(){
        int x = 10;
        System.out.println("Foo");
    }
}
