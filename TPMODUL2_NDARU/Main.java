// Main.java OOP-KRSY-NDARU-102022340086 

public class Main {
    public static void main(String[] args) {
        
        Animal genericAnimal = new Animal("Animal", 5);
        Cat cat = new Cat("Asep", 3, "BSH");
        Bird bird = new Bird("Udin", 1, "Parrot");

        
        genericAnimal.sound();
        genericAnimal.eat();
        genericAnimal.eat("Grass");
        genericAnimal.animalInfo();

        System.out.println();

        cat.sound();
        cat.animalInfo();

        System.out.println();

        bird.sound();
        bird.animalInfo();
    }
}

