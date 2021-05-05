package SpecyfikatoryDostępu;


//1 zadanie
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

//2 zadanie
//W zadaniu wykorzystaj projekt z poprzedniego zadania (Specyfikatory dostępu i JavaBeans). W klasie PointApplication dodaj proste sterowanie, które
//pozwoli na zmianę wartości współrzędnych punktu w zależności od wybranej opcji.
//Stwórz dowolny punkt,
//zdefiniuj kilka możliwych opcji wyboru. Np. wartość 0 oznacza przesunięcie punktu o 1 w lewo, 1 przesunięcie punktu o 1 w prawo itd.
//wykorzystaj strukturę switch i w niej wywołaj odpowiednią metodę klasy PointController,
//wyświetl zmienione współrzędne punktu.


public class PointApplication {
    //Punkt reprezentowany przez klasę Point powinien zawierać dwa pola reprezentujące współrzędną X oraz Y. Reprezentacja współrzędnych powinna być całkowitoliczbowa. Klasa powinna być zgodna ze specyfikacją JavaBeans. Klasa powinna posiadać konstruktor bezparametrowy oraz drugi, pozwalający ustawić odpowiednie współrzędne w trakcie tworzenia obiektu.
    //Klasa PointController posiada cztery metody, które pozwalają manipulować położeniem punktu:
    //-addX() - zwiększa wartość pola x obiektu o 1,
    //-minusX() - zmniejsza wartość pola x obiektu o 1,
    //-addY() - zwiększa wartość pola y obiektu o 1,
    //-minusY() - zmniejsza wartość pola y obiektu o 1.
    //Każda z metod przyjmuje jako parametr obiekt typu Point i zmienia jego pola x oraz y.
    //Obie klasy powinny znajdować się w osobnych pakietach, a ich działanie powinno zostać przetestowane w trzeciej klasie o nazwie PointApplication.

    public static void main(String[] args) {

        Point point1 = new Point(10, 20);
        PointControler pc = new PointControler();

        final int addX = 0;
        final int minusX = 1;
        final int addY = 2;
        final int minusY = 3;

        int option = minusX;

        switch (option) {
            case addX:
                pc.addX(point1);
                break;
            case minusX:
                pc.minusX(point1);
                break;
            case addY:
                pc.addY(point1);
                break;
            case minusY:
                pc.minusY(point1);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }

        System.out.println("Punkt po zmianie: (" + point1.getX() + ";" + point1.getY() + ")");

//        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
//        pc.addX(point1);
//        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
//        pc.addY(point1);
//        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
//        pc.minusX(point1);
//        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");
//        pc.minusY(point1);
//        System.out.println("Punkt: (" + point1.getX() + ";" + point1.getY() +")");

    }
}
