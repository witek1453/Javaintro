package MetodyIKonstruktory;
//Stwórz aplikację, która będzie służyła do przeliczania jednostek. Zdefiniuj klasę, która
// będzie posiadała metody do przeliczania jednostek metrycznych:
//metrów na centymetry
//metrów na milimetry
//centymetrów na metry
//milimetrów na metry
//W kolejnej klasie zdefiniuj metody związane z przeliczaniem czasu:
//godzin na minuty
//minut na sekundy
//sekund na milisekundy
//Zakładamy, że w przypadku jednostek czasu operujemy jedynie na wartościach całkowitych, czyli np. nie będziemy
// przeliczali "pół godziny na minuty".
//W osobnej klasie przetestuj działanie stworzonych metod.
//Korzystając ze zdefiniowanych metod przelicz np. 14 godzin na milisekundy.

public class MetricConverter {

    double metersToCm(double meters) {
        return meters * 100;
    }

    double metersToMM(double meters) {
        return meters * 1000;
    }

    double cmToMeters(double cm) {
        return cm / 100;
    }

    double mmToMeters(double mm) {
        return mm / 1000;
    }
}
