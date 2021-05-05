package TablicePetle;

public class Zad10 {

    // Napisz program, który usunie dany element z tablicy liczb całkowitych,
    // Tablica zawiera elementy, które się powtarzają.
    // numbers: [1,2,3,5,6,5,6]
    // liczba do usunięcia 5
    // wynik: [1,2,3,4,6,6]

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 5, 6, 7, 8};

        int numberToDelete = 5;

        int counter = 0;

        for (int number: numbers) {
            if (number == numberToDelete){
                counter++;
            }
        }

        System.out.println("counter " + counter);

        int [] newNumbers = new int [numbers.length-counter];

        System.out.println("numbers " + numbers.length);
        System.out.println("newNumbers " + newNumbers.length);

        for (int i = 0, k=0; i <numbers.length ; i++) {
            if (numbers[i]==numberToDelete){
                continue;
            }
            else {
                newNumbers[k]=numbers[i];
                k++;
            }
        }

        for (int number : newNumbers) {
            System.out.print(number + " ");
        }


    }
}
