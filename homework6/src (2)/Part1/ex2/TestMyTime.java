package Part1.ex2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        System.out.println(t1); //00:00:00

        MyTime t2 = new MyTime(3,4,5);
        System.out.println(t2); //03:04:05

        t1.setHour(6);
        t1.setMinute(7);
        System.out.println(t1); //06:07:00

        t2.setHour(30); //hour error

        System.out.println("Hour of t2 is: " + t2.getHour()); //Hour of t2 is: 0, vì phương thức setHour
                                                                // trả về hour = 0 nếu không hợp lệ
        System.out.println("Minute of t2 is: " + t2.getMinute()); //Minute of t2 is: 4
        System.out.println("Second of t2 is: " + t2.getSecond()); //Second of t2 is: 5

        MyTime t3 = new MyTime(30, 12,60);
        System.out.println(t3); //00:12:00, không hợp lệ ở hour và second


        System.out.println("Tăng 1 giờ 2 giây vào t1: " + t1.nextHour().nextSecond().nextSecond()); //07:07:02
        System.out.println("Tăng 1 phút 1 giây vào t2: " + t2.nextMinute().nextSecond()); //00:05:06
        System.out.println("Giảm 1 giờ 2 phút vào t3: " + t3.previousHour().previousMinute().previousMinute());
        //23:10:00
    }
}
