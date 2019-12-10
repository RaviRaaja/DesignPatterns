public class RealDuck extends Duck{
    public RealDuck(){
        iFly = new FlyWithWings();
        iQuack = new quack();
    }
    @Override
    public void display() {
        System.out.println("Iam RealDuck yaay!");
    }
}
