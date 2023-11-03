public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        soundBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println( "Hola, soy un pato silvestre" );
    }

    @Override
    public String toString() {
        return "MallardDuck{}";
    }
}
