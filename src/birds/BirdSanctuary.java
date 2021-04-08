package birds;

import java.util.HashSet;
import java.util.Set;

public class BirdSanctuary {

    private Set<Bird> birdsList = new HashSet<>();
    static BirdSanctuary instance;
    private BirdSanctuary(){

    }
    public synchronized static BirdSanctuary getInstance(){
        if (instance== null){
            instance = new BirdSanctuary();
        }
        return instance;
    }
    public void add(Bird bird) {

        birdsList.add(bird);
        bird.incrementCount();
    }
    public void remove(Bird bird){
        birdsList.remove(bird);
        bird.decrement();
    }

    public void printFlyable() {
        for (Bird bird : birdsList) {
            if (bird instanceof IFlyable) {
                ((IFlyable) bird).fly();
            }
        }
    }

    public void printSwimable() {
        for (Bird bird : birdsList) {
            if (bird instanceof ISwimable) {
                ((ISwimable) bird).swim();
            }
        }
    }

    public void printEatble(){
        for (Bird bird : birdsList) {
              if (bird instanceof IEatable){
                  ((IEatable)bird).eat();
              }
        }
    }
}

