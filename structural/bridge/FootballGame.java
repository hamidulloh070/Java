package structural.bridge;

public class FootballGame extends Game {
    public FootballGame(Developer developer) {
        super(developer);
    }

    @Override
    public void developGame() {
        System.out.print("FootballGame (Futbol o'yini): ");
        developer.writeCode();
    }
}
