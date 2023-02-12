import java.util.Scanner;

public class player {
    int guessNum;

    int guessingNum() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Player guess the number");
        guessNum = scn.nextInt();
        return guessNum;
    }
}
