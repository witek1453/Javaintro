package TablicePetle;

public class Zad3 {
    // Mając dwie tablice napisz program, który utworzy trzecią, dwuelementowa, tablicę, która
    // będzie składała się z pierwszego elementu z pierwszej tablicy
    // i ostatniego elementu z drugiej tablicy

    public static void main(String[] args) {

        int[] tab1 = {1, 2, 3};
        int[] tab2 = {4, 5, 6};
        int[] tab3 = new int[2];

        tab3[0] = tab1[0];
        tab3[1] = tab2[tab2.length - 1];

        for (int number : tab3) {
            System.out.println(number);
        }
    }

}
