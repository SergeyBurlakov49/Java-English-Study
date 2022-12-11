public class Timing {

    int months;
    int days;
    int hours;
    int minutes;

    public Timing(int months, int days, int hours, int minutes) {
        this.months = Math.abs(months);
        this.days = Math.abs(days);
        this.hours = Math.abs(hours);
        this.minutes = Math.abs(minutes);
        updateMinutes();
        updateHours();
        updateDays();
    }

    public Timing clone(){
        return new Timing(months, days, hours, minutes);
    }

    private void updateDays(){
        if(days > 30){
            months += days % 30;
            days -= (days % 30) * 30;
        }
    }

    private void updateHours(){
        if(hours > 24) {
            days += hours % 24;
            hours -= (hours % 24) * 24;
        }
    }

    private void updateMinutes(){
        if(minutes > 60) {
            hours += minutes % 60;
            minutes -= (minutes % 60) * 60;
        }
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
