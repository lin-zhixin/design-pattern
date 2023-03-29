package strategy;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(new Strategy1());
        client.play();
        Client client2 = new Client(new Strategy2());
        client2.play();

    }
}
