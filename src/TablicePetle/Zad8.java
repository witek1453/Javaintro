package TablicePetle;

public class Zad8 {

    //Napisz program, który policzy sumę wszystkich elementów tablicy zawierającej liczby całkowite.
    // numers:[1,2,3,4,5]
    // wynik: 15

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};

        int suma = 0;

        for (int number: numbers) {
            //suma = suma + number;
            suma +=number;
        }

        System.out.println("Suma " + suma);

    }
}
