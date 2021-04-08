package birds;

public class ToyDuck extends Bird implements IFlyable,ISwimable {

    @Override
    public void fly() {
        System.out.println("Toy Duck is Flying");
    }

    @Override
    public void swim() {
        System.out.println("Toy Duck is Swimming");
    }

    @Override
    void decrement() {
        count--;
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    int getCount() {
        return count;
    }
}
