package Part1.ex3;

public class MyDate {
    private int year, month, day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"
            , "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday"
            , "Thursday", "Friday", "Saturday"};
    public static int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (1 > day || day > getMonthLastDay(this.year, this.month)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return year % 100 != 0;
        }
        return year % 400 == 0;
    }

    public static int getMonthLastDay(int year, int month) {
        return DAYS_IN_MONTHS[month - 1] + (isLeapYear(year) && month == 2 ? 1 : 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0 || year > 9999) {
            return false;
        }
        if (month < 0 || month > 12) {
            return false;
        }
        if (day < 0 || day > 31) {
            return false;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day <= 29)
                    return true;
            } else {
                if (day <= 28)
                    return true;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        return true;
    }

    static int getDayOfWeek(int year, int month, int day) {
        int centuryNum = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int yearNum = lastTwoDigitsOfYear / 4;
        int monthNum;
        if (isLeapYear(year)) {
            monthNum = leapYearMonthNumbers[month - 1];
        } else {
            monthNum = nonLeapYearMonthNumbers[month - 1];
        }
        int dayNum = day;
        int temp = (centuryNum + lastTwoDigitsOfYear + yearNum + monthNum + dayNum) % 7;
        return temp;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate nextDay() {
        if (isLeapYear(this.year) && this.month == 2) {
            this.day = this.day == 29 ? 1 : this.day + 1;
        } else {
            this.day = this.day == DAYS_IN_MONTHS[this.month - 1] ? 1 : this.day + 1;
        }
        if (this.day == 1) {
            this.nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        if (this.month < 12 && this.day == DAYS_IN_MONTHS[this.month - 1]) {
            if (DAYS_IN_MONTHS[this.month - 1] != DAYS_IN_MONTHS[this.month]) {
                this.day = DAYS_IN_MONTHS[this.month];
            }
        } else if (isLeapYear(year) && this.day == 29 && this.month == 2) {
            this.day = DAYS_IN_MONTHS[2];
        }

        // Month
        this.month = this.month == 12 ? 1 : this.month + 1;

        //Year
        if (this.month == 1) {
            this.nextYear();
        }

        return this;
    }

    public MyDate nextYear()  {
        if (isLeapYear(this.year) && this.day == 29) {
            this.day = 28;
        }
        this.year += 1;

        return this;
    }

    public MyDate previousDay() {
        if (isLeapYear(this.year) && this.month == 3) {
            this.day = this.day == 1 ? 29 : this.day - 1;
            this.month = 2;
        } else {
            this.day = this.day == 1 ? DAYS_IN_MONTHS[this.month - 1] : this.day - 1;
        }
        if (this.day == DAYS_IN_MONTHS[this.month - 1]) {
            this.previousMonth();
        }
        return this;
    }

    public MyDate previousMonth() {
        if (this.month > 1 && this.day == DAYS_IN_MONTHS[this.month - 1]) {
            if (DAYS_IN_MONTHS[this.month - 1] != DAYS_IN_MONTHS[this.month - 2]) {
                this.day = DAYS_IN_MONTHS[this.month - 2];
            } else if (this.day == DAYS_IN_MONTHS[2] && isLeapYear(year)) {
                this.day = 28;
            }
        }

        this.month = this.month == 1 ? 12 : this.month - 1;

        if (this.month == 12) {
            this.previousYear();
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(this.year) && this.day == 29) {
            this.day = 28;
        }
        this.year -= 1;

        return this;
    }

    @Override
    public String toString() {
        int weekDay = getDayOfWeek(year, month, day);
        return DAYS[weekDay] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }
}