package TablicePetle;

public class Zad13 {

    // Napisz program, który znajdzie te same elementy w dwóch tablicach zawierających znaki.
    // tab 1 = ['a', 'b', 'c', 'd', 'e']
    // tab 2 = ['b', 'e']
    // wynik = b,e

    public static void main(String[] args) {

        char[] tab1 = {'a', 'b', 'c', 'd', 'e'};
        char[] tab2 = {'b', 'e'};

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (tab1[i] == tab2[j]) {
                    System.out.println("te same elementy: " + tab1[i]);
                }
            }

        }


    }
}
