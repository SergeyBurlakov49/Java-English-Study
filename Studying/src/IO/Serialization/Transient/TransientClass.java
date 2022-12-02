package IO.Serialization.Transient;

import java.io.Serial;
import java.io.Serializable;

public class TransientClass implements Serializable {


    @Serial
    private static final long serialVersionUID = -8320670070401069402L;
    transient int transientField;
    int unTransientField;

    public TransientClass(int transientField, int unTransientField) {
        this.transientField = transientField;
        this.unTransientField = unTransientField;
    }

    public String toString(){
        return ("Transient Field: " + transientField + "\n"
                + "Untransient Field: " + unTransientField);
    }
}
