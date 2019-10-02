public class Switch
{
    public static void main(String[] args)
    {
        int value = 3;
        switch (value)
        {
            case 1:
                System.out.println("Value 1");
                break;
            case 2:
                System.out.println("Value 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was either 3,4 or 5");
                System.out.println("Actually was " + value);
                break;

            default://Dersom case 1 eller 2 eller slår inn, vil denne alltid kjøres
                System.out.println("Not 1 or 2");
                break;
        }

        String value2 = "JANUARY";

        switch (value2.toLowerCase())
        {
            case "january":
                System.out.println("Value found is Jan");
                break;
            case "february":
                System.out.println("Value found is Feb");
                break;
            case "march":
                System.out.println("Value found is c");
                break;
            default:
                System.out.println("Value was not jan, feb or march");
                break;
        }
        printDayOfTheWeek(1);
        printDayOfTheWeek(-1);
    }

    public static void printDayOfTheWeek(int day)
    {
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lørdag");
                break;
            case 7:
                System.out.println("Søndag");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
