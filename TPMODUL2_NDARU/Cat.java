// Cat.java OOP-KRSY-NDARU-102022340086

class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Breed: " + breed);
    }
}