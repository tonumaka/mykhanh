import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUntil {
    static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] calendarDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static int maxValidYear = 9999;
    static int minValidYear = 1;

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }
    public static boolean isLeapYear(int year) {
        if (!(year % 4 == 0 && year % 100 != 0)) {
            return false;
        }
        return true;
    }
    
    public static boolean isValidDate(int year, int month, int day) {
        if (year < minValidYear || year > maxValidYear) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int dayInThatMonth = daysInMonths[month - 1];
        if (isLeapYear(year) && month == 2) {
            dayInThatMonth += 1;
        }
        return 1 <= day && day <= dayInThatMonth;
    }

    public static int getDayOfWeek(int year, int month, int day) {

        int numberFromCentury = 6 - 2 * ((year / 100) % 4);

        int lastTwoDigitsOfYear = year % 100;

        int[] nonLeapYearNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int numberFromMonthTable;
        if (isLeapYear(year)) {
            numberFromMonthTable = leapYearNumbers[month - 1];
        } else {
            numberFromMonthTable = nonLeapYearNumbers[month - 1];
        }

        return (numberFromCentury + lastTwoDigitsOfYear + lastTwoDigitsOfYear / 4 + numberFromMonthTable + day) % 7;
    }

    public static void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }

    public static String toString(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Not a valid date";
        }
        int dayOfWeekNumber = getDayOfWeek(year, month, day);
        return calendarDays[dayOfWeekNumber] + " " + day + " " + strMonths[month - 1] + " " + year;


    }

}
