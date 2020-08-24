package Homework;

public class Task3 {
    public static void main(String[] args) {
        double result = evaluate(13, 12, 11, 10);
        System.out.println(result);
    }
    private static double evaluate(int a, int b, int c, int d) {
        if (d == 0) {
            return 0;
        }
        return  a * (b + (c / d));

    }
}
