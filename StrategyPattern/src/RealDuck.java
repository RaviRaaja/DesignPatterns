public class RealDuck extends Duck{
    public RealDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new quack();
    }

    @Override
    public void display() {
        System.out.println("Iam RealDuck yaay!");
    }
}
