package Homework;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(test(5, 4));
        System.out.println(test(5, 8));
        System.out.println(test(5, 13));
        System.out.println(test(5, 16));
        System.out.println(test(5, 22));
    }
    private static boolean test(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
}
