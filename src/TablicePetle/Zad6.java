package TablicePetle;

public class Zad6 {
    // Napisz program, który przesunie wszystkie elementy tablicy o jedno miejsce w lewo.
    // Tablica składa się z liczb całkowitych. Rozmiar tablicy = 3.
    // tab: [20, 30, 40]
    // Wynik: [30, 40, 20]

    public static void main(String[] args) {

        int [] tab = {20, 30, 40};
        int [] results = new int [3];

        System.out.println(tab.length);
        for (int i = 0; i <tab.length; i++) {
            if(i==0){
                results[results.length-1] = tab[0];
            } else {
                results[i - 1] = tab[i];
            }
        }

        for (int number : results) {
            System.out.print(number + " ");
        }
    }

}
