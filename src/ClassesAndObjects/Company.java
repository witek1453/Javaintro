package ClassesAndObjects;

public class Company {

// Napisz program, w którym utworzysz dwie klasy:
//Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy. Podstawowe informacje o pracowniku jakie
// są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy,
//Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników, a następnie wyświetlisz
// informację o nich na ekranie.

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.firstName = "Jan";
        emp1.lastName = "Kowalski";
        emp1.birthYear = 2000;
        emp1.seniority = 5;

        Employee emp2 = new Employee();
        emp2.firstName = "Jan";
        emp2.lastName = "Czesław";
        emp2.birthYear = 1995;
        emp2.seniority = 3;

        Employee emp3 = new Employee();
        emp2.firstName = "Jan";
        emp2.lastName = "Kowal";
        emp2.birthYear = 1994;
        emp2.seniority = 1;

        System.out.println(emp1.firstName + " " + emp1.lastName + " " + emp1.birthYear + " " + emp1.lastName);
        System.out.println(emp2.firstName + " " + emp2.lastName + " " + emp2.birthYear + " " + emp2.lastName);
        System.out.println(emp3.firstName + " " + emp3.lastName + " " + emp3.birthYear + " " + emp3.lastName);
    }
}
