public class Main {
    public static void main(String[] args) {
        // real Duck
        Duck realDuck = new RealDuck();
        helperMethod(realDuck);

        System.out.println("*****************************");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehaviour(new FlyWithRocket());
        rubberDuck.setQuackBehaviour(new Sqeak());
        helperMethod(rubberDuck);

        // we have added new sub Duck class -  new requirement Wooden duck
        // we have not touched Duck class
        // we have added new behavior (Noquack) without touching any other interfaces or classes.
        System.out.println("*****************************");
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.setQuackBehaviour(new NoQuack());
        woodenDuck.setFlyBehaviour(new NoFly());
        helperMethod(woodenDuck);
    }

    public static void helperMethod(Duck d) {
        d.display();
        d.performFly();
        d.performQuack();
    }
}
