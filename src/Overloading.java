public class Overloading
{
    public static void main(String[] args)
    {
        /*
        int newScore = calculateScore("Jakk", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
         */
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnammed player scored " + score +" points");
        return score*1000;
    }

    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet < 0 || ((inches < 0) || (inches >= 12)))
        {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters +=inches*2.54;
        System.out.println(feet + " feet, " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches < 0)
        {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int)inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }


}
