package OperationonVariables;

import java.util.Random;

//Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich dowolne liczby, a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:
//Czy x jest większe od y?
//Czy x pomnożone przez 2 jest większe od y?
//Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
//Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)

public class CompareNumbers {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(100);
        int y = random.nextInt(100);

        System.out.println("x=" + x + ",y=" + y);

        //Czy x jest większe od y?

        boolean results = x < y;
        System.out.println("x < y " + results);

        //Czy x pomnożone przez 2 jest większe od y?
        results = x * 2 > y;
        System.out.println("x * 2 > y " + results);

        //Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
        results = (y < x+3) && (y > x-2);
        System.out.println("y < x+3 && y > x-2 " + results);

        //Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
        results = ((x % y) % 2 == 0);
        System.out.println("Czy x*y jest parzyste? " + results);


    }
}
