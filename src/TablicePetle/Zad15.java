package TablicePetle;

public class Zad15 {
    //Napisz program, który znajdzie wszystkie pary liczb, których suma jest równa innej liczbie.
    // tab: [1, 2, 3, 4, 5]
    // suma = 5
    // wynik: 1,4 i 2,3

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i + 1; j <numbers.length ; j++) {
                if (numbers[i] + numbers[j] == 5){
                    System.out.println("Pary liczb to " + numbers[i] + " " + numbers[j]);
                }
            }

        }
    }
}
