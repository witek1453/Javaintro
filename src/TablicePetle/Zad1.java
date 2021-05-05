package TablicePetle;

public class Zad1 {
    // Napisz program, który sprawdzi czy pierwszy i ostatni element
    // w tablicy zawierającej liczby całkowite są takie same.
    // tab = [1,2,3,1] - true
    // tab = [1,2,4,5] - false

    public static void main(String[] args) {

        int[] tab = {1,2,4,1};
        System.out.println("Długość tablicy to: " + tab.length);
        System.out.println("Pierwszy elemento to: " + tab[0]);
        System.out.println("Ostatni element to: " + tab[tab.length-1]);

        if (tab[0]==tab[tab.length-1]){
            System.out.println("Elementy są takie same");
        }
        else {
            System.out.println("Elementy nie są takie same");
        }

    }
}
