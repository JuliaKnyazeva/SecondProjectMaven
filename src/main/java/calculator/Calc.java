package calculator;

public class Calc extends Device{


    static {
        System.out.println("Calcularot status: OK");
    }
    static int digits; // для наследования
    private static final int SCREEN_DIGITS = 10;// нельзя наследовать и изменять методы

    public static int getScreenDigits() {
        return SCREEN_DIGITS;
    }



    @Override //для абстракт обязательно
    public int sum(int a, int b) {
        return a + b;
    }
}
