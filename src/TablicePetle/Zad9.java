package TablicePetle;

public class Zad9 {

    // Napisz program, który usunie dany element z tablicy liczb całkowitych
    // Tablica zawiera tylko unikalne elementy.
    // liczba do usunięcia: 5
    // wynik = [1,2,3,4,6]

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8};
        int [] newNumbers = new int[numbers.length-1];

        int numberToDelete = 5;

        for (int i = 0, k=0; i <numbers.length ; i++) {
            if (numbers[i] == numberToDelete){
                continue;
            }
            else {
                newNumbers[k] = numbers[i];
                k++;
            }
        }

        for (int number : newNumbers) {
            System.out.print(number + " ");
        }
    }
}
