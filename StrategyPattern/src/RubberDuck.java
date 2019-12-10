public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehaviour = new NoFly();
        quackBehaviour = new Sqeak();
    }

    public void setFlyBehaviour(IFlyable fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(IQuackable qb){
        quackBehaviour = qb;
    }

    @Override
    public void display() {
        System.out.println("Im Rubber Duck");
    }
}
