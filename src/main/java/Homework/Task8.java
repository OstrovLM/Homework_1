package Homework;

public class Task8 {
    public static void main(String[] args) {
        leapYear(825);
        leapYear(1100);
        leapYear(1600);
        leapYear(2020);
    }
    private static void leapYear(int year){

        if (year % 4 == 0 && year % 100 != 0)  {
                System.out.println(year + " is a leap year");
        }
        else if ( year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }

        else {
                System.out.println(year + " is not a leap year");
        }
    }

}
