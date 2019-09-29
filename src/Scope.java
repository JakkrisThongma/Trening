public class Scope
{
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*
        Oppgave:
        Print out a second score on the screen with the following
        score set to 10000
        LevelCompleted set to 8
        bonus set to 200
         */
        if(gameOver)
        {
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Første måte, gi de tidligere verdiene midlertidige verdier
        //Negativt: Har ikke noe "register" på disse midlertidige verdiene, og duplikat kode
        if(gameOver)
        {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }

        /*
        Challenge

         */
    }
}
