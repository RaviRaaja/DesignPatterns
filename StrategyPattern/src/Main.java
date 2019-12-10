public class Main {
    public static void main(String[] args) {
        // real Duck
        Duck realDuck = new RealDuck();
        realDuck.display();
        realDuck.performFly();
        realDuck.performQuack();

        System.out.println("*****************************");
        Duck rubberDuck = new RubberDuck();
        realDuck.display();
        realDuck.performFly();
        realDuck.performQuack();

        // change behaviour in runtime then use below.
        System.out.println("*****************************");
        ((RubberDuck) rubberDuck).setFlyBehaviour(new FlyWithRocket());
        rubberDuck.performFly();
        System.out.println("No rocket Fuel!");
        ((RubberDuck) rubberDuck).setFlyBehaviour(new NoFly());
        rubberDuck.performFly();
        rubberDuck.performFly();
    }
}
