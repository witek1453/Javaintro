package MethodOverload;

public class Calctest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 0;
        double b = 40;
        double c = 5;

        System.out.println("A: " + a + ", B: " + b + ", C: " + c);

        System.out.println("A+B = " + calc.add(a, b));
        System.out.println("A+B+C = " + calc.add(a, b, c));

        System.out.println("A-B = " + calc.subtract(a, b));
        System.out.println("A-B-C = " + calc.subtract(a, b, c));
    }
}
