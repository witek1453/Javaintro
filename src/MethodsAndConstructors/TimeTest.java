package MethodsAndConstructors;

public class TimeTest {

    public static void main(String[] args) {

        TimeConverter timeConverter = new TimeConverter();

        int hour = 2;
        int minutes = timeConverter.hourToMinutes(hour);
        int seconds = timeConverter.minutesToSeconds(minutes);
        int milis = timeConverter.secondsToMiliseconds(seconds);

        System.out.println("Hour= " + hour);
        System.out.println("HourToMinutes= " + minutes + ", MinutesToSeconds= " + seconds + ", SecondsToMilis= " + milis);
    }
}
