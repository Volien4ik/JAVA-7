
public class Task_DateTime_2 {
    public static void main(String[] args) {
        int start = 2015;
        int end = 2022;
        for (int year = start; year <= end; year++) {
            boolean leap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
            System.out.println("Year: " + year + " = " + (leap ? 366 : 365));
        }
    }
}
