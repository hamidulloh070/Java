package structural.bridge;

public class GameRunner {
    public static void main(String[] args) {
        Game racingJava = new RacingGame(new JavaDeveloper());
        Game racingCpp = new RacingGame(new CppDeveloper());
        Game footballJava = new FootballGame(new JavaDeveloper());
        Game footballCpp = new FootballGame(new CppDeveloper());

        racingJava.developGame();
        racingCpp.developGame();
        footballJava.developGame();
        footballCpp.developGame();
    }
}
