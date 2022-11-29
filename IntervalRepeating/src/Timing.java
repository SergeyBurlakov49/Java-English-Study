import java.util.Date;

public class Timing {

    int minutes;
    int hours;
    int days;
    int months;

    public Timing(int minutes, int hours, int days, int months) {

        this.minutes = minutes;
        this.hours = hours;
        this.days = days;
        this.months = months;
        updateMinutes();
        updateHours();
        updateDays();
    }

    private void updateMinutes(){
        if (minutes >= 60){
            hours += minutes / 60;
            minutes %= 60;
        }
    }

    private void updateHours(){
        if (hours >= 24){
            days += hours / 24;
            hours %= 24;
        }
    }

    private void updateDays(){
        if (days >= 30){
            months += days / 30;
            days %= 30;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
