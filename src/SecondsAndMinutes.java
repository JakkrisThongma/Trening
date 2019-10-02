public class SecondsAndMinutes
{
    public static void main(String[] args) {
        getDurationString(120,0);
        getDurationString(7201);
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || seconds < 0 || seconds >59)
        {
            System.out.println("Invalid value");
            return"Invalid value";
        }

        int hours = minutes/60;
        int minutesReturned = minutes % 60;
        System.out.println(hours+"h " + minutesReturned + "m " + seconds + "s ");
        return hours+"h " + minutesReturned + "m " + seconds + "s ";
    }

    public static String getDurationString(int seconds)
    {
        if(seconds<0)
        {
            System.out.println("Invalid value");
            return"Invalid value";
        }

        int minutes = seconds/60;
        int returnedSeconds = seconds % 60;

        return getDurationString(minutes, returnedSeconds);
    }
}
