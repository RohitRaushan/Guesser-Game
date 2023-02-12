public class Launch {
    public static void main(String[] args) {
        umpire u = new umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
