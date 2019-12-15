public class RubberDuck extends Duck {

    public RubberDuck(){
        // we dont want this instantiation we can setbehaviours dynamically
        //  flyBehaviour = new NoFly();
        //  quackBehaviour = new Sqeak();
    }

    @Override
    public void display() {
        System.out.println("Im Rubber Duck");
    }
}
