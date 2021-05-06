package TablicePetle;

public class Zad12 {

    //Napisz program, który znajdzie takise same wartości w tablicy liczb całkowitych.
    // tab: [1, 2, 3, 2, 3, 4, 5, 6, 6]
    //Wynik: 2,3,6

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 3, 4, 5, 6, 6};
        int value = 0;

        for (int i = 0; i < numbers.length; i++) {
            value = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (value == numbers[j]) {
                    System.out.print(value + " ");
                }

            }

        }

    }
}
