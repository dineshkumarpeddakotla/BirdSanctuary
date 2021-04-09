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

    public boolean equals(Object object) {

        return super.equals(object);
    }
}
