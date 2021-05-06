package TablicePetle;

public class Zad14 {

    // Napisz program, który znajdzie drugi największy element w tablicy zawierającej liczby całkowite.
    // tab = [1, 3, 4, 2, 7, 20]
    // wynik = 7


    public static void main(String[] args) {

int [] numbers = {1, 3, 5, 2, 20, 7};
int max = numbers[0];
int max2 = -1;

        for (int i = 1; i <numbers.length ; i++) {
            if (numbers[i] > max){
                max2= max;
                max= numbers[i];
            }
            else {
                if (numbers[i] > max2){
                    max2 = numbers [i];
                }
            }
        }
        System.out.println("max " + max);
        System.out.println("max2 "+ max2);

    }
}
