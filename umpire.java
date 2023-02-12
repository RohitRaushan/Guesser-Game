import javax.lang.model.util.ElementScanner14;

public class umpire {
    int numFromGuesser;
    int numFromPlayer1, numFromPlayer2, numFromPlayer3;

    void collectNumFromGuesser() {
        guesser g = new guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectNumFromPlayer() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        numFromPlayer1 = p1.guessingNum();
        numFromPlayer2 = p2.guessingNum();
        numFromPlayer3 = p3.guessingNum();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
                System.out.println("All Players guessed corectly");
            else if (numFromGuesser == numFromPlayer2)
                System.out.println("Player 1 & Player 2 won the game");
            else if (numFromGuesser == numFromPlayer3)
                System.out.println("player 1 & player 3 won the game");
            else
                System.out.println("player 1 won the game");
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3)
                System.out.println("player 2 & player 3 won the game");
            else
                System.out.println("player 2 won the game");
        } else if (numFromGuesser == numFromPlayer3)
            System.out.println("player 3 won the game");
        else {
            System.out.println("no player guessed correctly");
        }

    }
}
