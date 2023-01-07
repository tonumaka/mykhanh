package Part1.ex2;

public class MyTime {
    private int hour, minute, second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }



    //input validation
    public void setSecond(int second) {
        if (second >= 0 && second <=59) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("second error");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("minute error");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("hour error");
        }
    }

    public MyTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        ++minute;
        if (minute >= 60) {
            minute = 0;
            second = 0;
            ++hour;
            if (hour >= 23) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        ++hour;
        if (hour >= 23) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        --second;
        if (second <= 0) {
            second = 59;
            --minute;
            if (minute <= 0) {
                minute = 59;
                --hour;
                if (hour <= 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        --minute;
        if (minute <= 0) {
            minute = 59;
            second = 59;
            --hour;
            if (hour <= 0) {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        --hour;
        if (hour <= 0) {
            hour = 23;
        }
        return this;
    }
}
