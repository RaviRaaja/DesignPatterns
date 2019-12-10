public class RubberDuck extends Duck {
    public RubberDuck(){
        iFly = new NoFly();
        iQuack = new Sqeak();
    }

    @Override
    public void display() {
        System.out.println("Im Rubber Duck");
    }
}
