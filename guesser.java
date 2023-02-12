import java.util.Scanner;

public class guesser {
    int guessNum;

    int guessingNum() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Guesser guess the number");
        guessNum = scn.nextInt();
        return guessNum;
    }
}
