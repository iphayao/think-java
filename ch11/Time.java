public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters and setters
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return (int)this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(double second) {
        this.second = second;
    }

    public static void printTime0(Time t) {
        System.out.print(t.hour);
        System.out.print(":");
        System.out.print(t.minute);
        System.out.print(":");
        System.out.print(t.second);
    }

    public static void printTime(Time t) {
        System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
    }

    public String toString() {
        return String.format("%02d:%02d:%04.1f", this.hour, this.minute, this.second);
    }

    public boolean equals(Time that) {
        return this.hour == that.hour
            && this.minute == that.minute
            && this.second == that.second;
    }

    public static Time add(Time t1, Time t2) {
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;
        return sum;
    }

    public Time add(Time that) {
        Time sum = new Time();
        sum.hour = this.hour + that.hour;
        sum.minute = this.minute + that.minute;
        sum.second = this.second + that.second;

        if(sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if(sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }

        return sum;
    }

    public void increment(double seconds) {
        this.second += seconds;
        while(this.second >= 60) {
            this.second -= 60;
            this.minute += 1;
        }
        while(this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
    }
}