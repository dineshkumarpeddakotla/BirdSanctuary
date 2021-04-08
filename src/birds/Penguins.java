package birds;

public class Penguins extends Bird implements ISwimable,IEatable {
    static int count;
    void incrementCount() {
        count++;
    }

    public void eat() {
        System.out.println("Penguins is Eating");
    }

    public void swim() {
        System.out.println("Penguins is Swimming");
    }

    @Override
    void decrement() {
        count--;
    }

    @Override
    int getCount() {
        return count;
    }
}