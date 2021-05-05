package AgregacjaIKompozycja;

public class Bank {
    //Stwórz konto bankowe dla osoby, która ma identyczny adres zamieszkania i zameldowania oraz drugie konto dla osoby, która
// mieszka w innym miejscu niż jest zameldowana. Obie te osoby mieszkają pod tym samym adresem.
//Wyświetl informację o imieniu, nazwisku i miejscowości zamieszkania każdej osoby oraz o ilości środków na koncie każdej z tych osób.
    public static void main(String[] args) {

        // 1 osoba
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "93120514887";

        // Utworzenie adresu
        Adresses adresses1 = new Adresses();
        adresses1.city = "Wrocław";
        adresses1.postalCode = "59-600";
        adresses1.street = "Majowa";
        adresses1.home = 1;
        adresses1.flat = 11;

        //Adres zamiekszania taki sam jak zameldowania
        person1.livingAdress = adresses1;
        person1.registeredAddress = adresses1;

        // Utworzenie 1 konta
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10000;

        // 2 osoba
        Person person2 = new Person();
        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.pesel = "91070645628";
        person2.registeredAddress = new Adresses();
        person2.registeredAddress.city = "Kraków";
        person2.registeredAddress.postalCode = "30-333";
        person2.registeredAddress.street = "Mickiewicza";
        person2.registeredAddress.home = 15;
        person2.registeredAddress.flat = 8;
        person2.livingAdress = adresses1;

        //Utworzenie 2 konta
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("mieszka w miejscowości: " + person1.livingAdress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.livingAdress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);

    }
}
