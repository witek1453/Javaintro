package MetodyIKonstruktory;

public class Calculator {
    //Napisz program-kalkulator operujący na liczbach zmiennoprzecinkowych typu double , który
//będzie składał się z dwóch klas w osobnych plikach:
//Calculator.java - Klasa tu zdefiniowana powinna zawierać metody add(), subtract(), multiply(), divide(), czyli
//kolejno dodawanie, odejmowanie, mnożenie i dzielenie. Zastanów się jakie argumenty powinny przyjmować
//oraz wartość jakiego typu powinny zwracać
//Calculate.java - tutaj umieść klasę testową z metodą main(). Zadeklaruj i zainicjuj
//w niej co najmniej 2 zmienne typu double, utwórz obiekt klasy Calculator i za jego pomocą oblicz wynik różnych działań matematycznych.
//Wszystkie wyniki działań wyświetl na ekranie.
    public static void main(String[] args) {

        Calculate calc = new Calculate();
        double a = 15;
        double b = 2.5;

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("A + B = " + calc.add(a, b));
        System.out.println("A - B = " + calc.subtract(a, b));
        System.out.println("A * B = " + calc.multiply(a, b));
        System.out.println("A / B = " + calc.divide(a, b));
    }

}
