package structural.bridge;

public class RacingGame extends Game {
    public RacingGame(Developer developer) {
        super(developer);
    }

    @Override
    public void developGame() {
        System.out.print("RacingGame (Poyga o'yini): ");
        developer.writeCode();
    }
}
