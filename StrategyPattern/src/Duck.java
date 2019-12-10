public abstract class Duck {
    // composition
    // All duck subclasses inherit this.
    IFlyable flyBehaviour;
    IQuackable quackBehaviour;

    public abstract void display();

    // Don't show the interfaces references directly in main method.
    // Delegate to behaviour class

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}
