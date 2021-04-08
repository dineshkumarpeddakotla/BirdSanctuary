package birds;

public abstract class Bird {
    static int count;
    abstract int getCount();
    void incrementCount() {
        count++;
    }
    void decrement(){
        count--;
    }

}
