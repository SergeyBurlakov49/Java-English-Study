public class TimePoint {

    Timing timing;
    int discard;

    public TimePoint(Timing timing, int discard) {
        this.timing = timing;
        this.discard = discard;
    }

    public TimePoint clone(){
        return new TimePoint(timing.clone(), discard);
    }

}
