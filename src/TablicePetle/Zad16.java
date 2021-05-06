package TablicePetle;

public class Zad16 {
    //Napisz program, który policzy wszystkie liczby parzyste
    // i nieparzyste w tablicy zawierającej liczby całkowite.
    // tab = [2,3,4,5,6]
    // wynik: parzyste:3, nieparzyste:2

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6};

        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Parzyste: " + even);
        System.out.println("Nieparzyste: " + odd);
    }
}
