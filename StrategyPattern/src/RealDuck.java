public class RealDuck extends Duck{
    public RealDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new quack();
    }

    public void setFlyBehaviour(IFlyable fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(IQuackable qb){
        quackBehaviour = qb;
    }

    @Override
    public void display() {
        System.out.println("Iam RealDuck yaay!");
    }
}
