package MetodyIKonstruktory;

public class MetricTests {

    public static void main(String[] args) {

        MetricConverter metricConverter = new MetricConverter();
        double m = 1;
        double cm = 1;
        double mm = 1;

        double mToCm = metricConverter.metersToCm(m);
        double mToMm = metricConverter.metersToMM(m);
        double cmToM = metricConverter.cmToMeters(cm);
        double mmToM = metricConverter.mmToMeters(mm);

        System.out.println("M= " + m + ", CM= " + cm + ", MM= " + mm);
        System.out.println("MToCm = " + mToCm + ", MToMm= " + mToMm + ", CmToM= " + cmToM + ", MmToM= " + mmToM);


    }


}
