package strategy;

public class Client {
    private Strategy strategy;

    public Client(Strategy strategy) {
        this.strategy = strategy;
    }

    public void play() {
        strategy.play();
    }
}
