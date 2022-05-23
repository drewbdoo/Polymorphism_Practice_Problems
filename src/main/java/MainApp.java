public class MainApp {
    public static void main(String[] args) {
//        //Herds part 1
//        Organism organism = new Organism(20, 30);
//        System.out.println(organism);
//        organism.move(-10, 5);
//        System.out.println(organism);
//        organism.move(50, 20);
//        System.out.println(organism);

//        //Herds part 2
//        Herd herd = new Herd();
//        herd.addToHerd(new Organism(57, 66));
//        herd.addToHerd(new Organism(73, 56));
//        herd.addToHerd(new Organism(46, 52));
//        herd.addToHerd(new Organism(19, 107));
//        System.out.println(herd);

//        //Animals part 2
//        Dog dog = new Dog();
//        dog.bark();
//        dog.eat();
//
//        Dog fido = new Dog("Fido");
//        fido.bark();

//        //Animals part 3
//        Cat cat = new Cat();
//        cat.purr();
//        cat.eat();
//
//        Cat garfield = new Cat("Garfield");
//        garfield.purr();

        //Animals part 4
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();


    }
}
