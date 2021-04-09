package birds;

public class Main {
    public static void main(String[] args) {
        BirdSanctuary sanctuary = BirdSanctuary.getInstance();

        Parrot parrot = new Parrot();
        Parrot parrotObj =new Parrot();
        Duck duck = new Duck();
        Penguins penguins = new Penguins();
        Penguins penguinObj = new Penguins();
        ToyDuck toyDuck = new ToyDuck();

        sanctuary.add(penguins);
        sanctuary.add(parrotObj);
        sanctuary.add(duck);
        sanctuary.add(parrot);
        sanctuary.add(penguinObj);
        sanctuary.add(toyDuck);
        sanctuary.add(duck);

        sanctuary.remove(parrotObj);
        sanctuary.remove(toyDuck);

        sanctuary.printEatble();
        sanctuary.printFlyable();
        sanctuary.printSwimable();

        System.out.println(duck.getCount());
        System.out.println(parrot.getCount());
        System.out.println(penguins.getCount());
        System.out.println(toyDuck.getCount());
    }
}
