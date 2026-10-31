package structural.bridge;

public abstract class Game {
    protected final Developer developer;

    protected Game(Developer developer) {
        this.developer = developer;
    }

    public abstract void developGame();
}
