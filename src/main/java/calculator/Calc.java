package calculator;

public class Calc {


    static int digits; // для наследования
    private static final int SCREEN_DIGITS = 10;// нельзя наследовать и изменять методы

    public static int getScreenDigits() {
        return SCREEN_DIGITS;
    }


    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
