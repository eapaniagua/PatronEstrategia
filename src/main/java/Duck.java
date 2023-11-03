public abstract class Duck {
    protected IFly flyBehavior;
    protected ISound soundBehavior;
    public Duck(){}

    public void swim() {
        System.out.println( "Estoy nadando, incluso puedo flotar" );
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSound() {
        soundBehavior.makeSound();
    }

    public abstract void display();

    @Override
    public String toString() {
        return "Duck{}";
    }
}
