package app;

import controller.PointControler;
import data.Point;

//Napisz program, który pozwala na kontrolowanie danych obiektu, który reprezentuje punkt na płaszczyźnie.
//Punkt reprezentowany przez klasę Point powinien zawierać dwa pola reprezentujące współrzędną X oraz Y.
//Reprezentacja współrzędnych powinna być całkowitoliczbowa. Klasa powinna być zgodna ze specyfikacją JavaBeans.
//Klasa powinna posiadać konstruktor bezparametrowy oraz drugi, pozwalający ustawić odpowiednie współrzędne w trakcie tworzenia obiektu.

//Klasa PointController posiada cztery metody, które pozwalają manipulować położeniem punktu:
//-addX() - zwiększa wartość pola x obiektu o 1,
//-minusX() - zmniejsza wartość pola x obiektu o 1,
//-addY() - zwiększa wartość pola y obiektu o 1,
//-minusY() - zmniejsza wartość pola y obiektu o 1.

//Każda z metod przyjmuje jako parametr obiekt typu Point i zmienia jego pola x oraz y.
//Obie klasy powinny znajdować się w osobnych pakietach, a ich działanie powinno zostać przetestowane
// w trzeciej klasie o nazwie PointApplication.
public class PointApplication {

    public static void main(String[] args) {

        Point point1 = new Point(10,20);
        PointControler pc = new PointControler();

        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
        pc.addX(point1);
        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
        pc.addY(point1);
        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
        pc.minusX(point1);
        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
        pc.minusY(point1);
        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");

    }
}
