public class CurveRepeatPoint {

    Timing timeToUnlock;
    int throwing;

    public CurveRepeatPoint(Timing timeToUnlock, int throwing) {
        this.timeToUnlock = timeToUnlock;
        this.throwing = throwing;
    }

    public CurveRepeatPoint(Timing timeToUnlock) {
        this.timeToUnlock = timeToUnlock;
        this.throwing = 0;
    }
}
