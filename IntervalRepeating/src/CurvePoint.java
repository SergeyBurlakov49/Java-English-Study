import java.io.Serializable;

public class CurvePoint implements Serializable {

    Timing timeToUnlock;
    int throwing;

    public CurvePoint(Timing timeToUnlock, int throwing) {
        this.timeToUnlock = timeToUnlock;
        this.throwing = throwing;
    }

    public CurvePoint(Timing timeToUnlock) {
        this.timeToUnlock = timeToUnlock;
        this.throwing = 0;
    }
}
