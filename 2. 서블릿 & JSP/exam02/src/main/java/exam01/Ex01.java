package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        //s1.year = 2023;
        //s1.month = 11;
        //s1.day = 30;

        s1.setYear(2023);
        s1.setMonth(12);
        s1.setDay(30);

        System.out.println(s1);
    }
}
