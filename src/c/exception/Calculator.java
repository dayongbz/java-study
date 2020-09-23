package c.exception;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.printDivide(1, 2);
            calc.printDivide(1, 0);
            calc.printDivide(1, 4);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void printDivide(double d1, double d2) throws Exception {

        if (d2 == 0) {
            throw new Exception("Second value can't be Zero");
        }
        double result = d1 / d2;
        System.out.println(result);
    }
}
