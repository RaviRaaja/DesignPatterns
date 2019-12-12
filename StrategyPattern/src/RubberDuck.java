public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehaviour = new NoFly();
        quackBehaviour = new Sqeak();
    }

    @Override
    public void display() {
        System.out.println("Im Rubber Duck");
    }
}
