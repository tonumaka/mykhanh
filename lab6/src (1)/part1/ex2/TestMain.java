package part1.ex2;

public class TestMain {
    public static void main(String[] args) {
        Student student1 = new Student("Mai", "Main Street", "Computer", 2000, 550000);
        System.out.println("Student:"
                + " name=" + student1.getName()
                + " address=" + student1.getAddress()
                + " program=" + student1.getProgram()
                + " year=" + student1.getYear()
                + " fee=" + student1.getFee());

        Staff staff1 = new Staff("Khanh", "HaNoi", "Science" , 340000);
        System.out.println("Staff:"
                + " name=" + staff1.getName()
                + " address=" + staff1.getAddress()
                + " program=" + staff1.getSchool()
                + " fee=" + staff1.getPay());
    }

}
