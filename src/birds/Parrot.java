package birds;

public class Parrot extends Bird implements IFlyable,IEatable {

    static int count;
    void incrementCount() {
        count++;
    }

    public void fly(){
        System.out.println("Parrot is Flying");
    }
    public void eat(){
        System.out.println("Parrot is Eating");
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
