package testguice.sub1;

public class ConsoleSource implements Source {
    @Override
    public void update() {
        System.out.println("Updated!");
    }
}
