package Zmienne;

class CarShop {
    //Napisz program, w którym zadeklarujesz zmienne, które będą reprezentować samochód w salonie samochodowym poprzez:
    //Markę
    //Model
    //Rocznik
    //Cenę
    //Możesz również dodać dowolne zmienne, które samodzielnie uznasz za stosowne. Do reprezentacji każdego z powyższych elementów wykorzystaj najbardziej odpowiedni Twoim zdaniem typ danych.
    //Na końcu wyświetl informacje o samochodzie, które przypisałeś do zmiennych.
    public static void main(String[] args) {
        String carBrand = "Audi";
        String carModel = "A4";
        int carYear = 2007;
        double carPrice = 67000.0;

        System.out.println("Wybrany samochód to:");
        System.out.print(carBrand);
        System.out.print(" ");
        System.out.print(carModel);
        System.out.print(", rocznik ");
        System.out.print(carYear);
        System.out.print(", cena ");
        System.out.print(carPrice);
        System.out.println("zł");
    }
}