package birds;

public class Duck extends Bird implements IFlyable,ISwimable,IEatable {
    static int count=0;

    @Override
    void incrementCount() {
        count++;
    }

    public void fly(){
        System.out.println("Duck is Flying");
    }

    public void eat(){
        System.out.println("Duck is Eating");
    }

    public void swim(){
        System.out.println("Duck is Swimming");
    }

    @Override
    void decrement() {
        Bird.count--;
    }

    @Override
    int getCount() {
        return count;
    }

}
