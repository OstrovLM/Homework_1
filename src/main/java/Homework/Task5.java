package Homework;

public class Task5 {
    public static void main(String[] args) {
        digit(8);
        digit(0);
        digit(-3);

    }
    private static void digit(int dig) {
        if (dig < 0){
            System.out.println(dig + " is negative digit");
        }
        else {
            System.out.println(dig + " is positive digit" );
        }
    }
}
