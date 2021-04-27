package calculator;

public class CalcTest {
    public static void main(String[] args) {

        Calc calc = new Calc();
        System.out.println(calc.sum(2, 2) == 4);
        System.out.println(calc.subtract(0,0) == 0);
        System.out.println(calc.subtract(-2,-2) == -4);
        System.out.println(calc.subtract(2,2) == 5);

    }
}
