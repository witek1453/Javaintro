package TablicePetle;

public class Zad17 {
    //Napisz program, który sprawdzi czy suma co trzeciego elementu w tablicy = 10.
    //Zwróć true jeżeli tak, false jeżeli nie.
    // tab1 = [1, 2, (3), 1, 2, (3), 1, 2, (4)] -> true
    // tab2 = [1, 2, (3), 1, 2, (3), 1, 2, (3)] -> false

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1, 2, 3, 1, 2, 4};

        int suma = 0;
        // 1 sposób
//
//        for (int i = 1; i <= numbers.length; i++) {
//            if (i % 3 == 0) {
//                suma += numbers[i - 1];
//            }
//        }

        // 2 sposób
        for (int i = 2; i <numbers.length ; i+=3) {
            suma+=numbers[i];
        }

        if (suma == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
