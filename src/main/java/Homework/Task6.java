package Homework;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(isNegative(2));
        System.out.println(isNegative(0));
        System.out.println(isNegative(-7));

    }
    private static boolean isNegative (int dig) {
        return dig < 0;
    }
}
