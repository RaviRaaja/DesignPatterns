public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck realDuck = new RealDuck();
        // Rubber duck
        rubberDuck.display();
        rubberDuck.iFly.fly();
        rubberDuck.iQuack.quack();
        // Real duck
        realDuck.display();
        realDuck.iFly.fly();
        realDuck.iQuack.quack();

    }
}
