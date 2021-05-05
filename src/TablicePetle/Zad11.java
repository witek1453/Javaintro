package TablicePetle;

public class Zad11 {

    // Napisz program, który znajdzie max i min wartość w tablicy
    // zawierającej liczby całkowite
    // tab: [9,8,2];
    // min - 2, max = 9

    public static void main(String[] args) {

        int[] numbers = {2, -1, 0, 100, 40, 99};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("Min= " + min);
        System.out.println("Max= " + max);
    }
}
