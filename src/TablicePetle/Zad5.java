package TablicePetle;

public class Zad5 {
    // Napisz program, który zamieni pierwszy i ostatni element w tablicy.
    // tab1: [1, 3, 5, 4]
    // wynik: [4, 3, 5, 1]

    public static void main(String[] args) {
        int[] tab = {1, 3, 5, 4};

        System.out.println("Długość tablicy: " + tab.length);

        // Rozwiązanie 1
//
//        int first = tab[0];
//        int last = tab[tab.length-1];
//        tab[0] = last;
//        tab[tab.length-1] = first;
//
//        for (int number : tab) {
//            System.out.print(number + " ");
//        }

//        // Rozwiązanie 2
//
//        int temp = tab[0];
//        tab[0] = tab[tab.length - 1];
//        tab[tab.length - 1] = temp;
//
//        for (int number : tab) {
//            System.out.print(number + " ");
//        }

        // Rozwiązanie 3
        tab[0] = tab[0] + tab[tab.length-1];
        tab[tab.length-1] = tab[0] - tab[tab.length-1];
        tab[0] = tab[0] - tab[tab.length-1];

        for (int number : tab) {
            System.out.print(number + " ");
        }
    }

}
