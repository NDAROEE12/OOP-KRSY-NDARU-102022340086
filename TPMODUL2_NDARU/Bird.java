// Bird.java OOP-KRSY-NDARU-102022340086


class Bird extends Animal {
    private String featherColor;

    public Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    @Override
    public void sound() {
        System.out.println("Bird chirps.");
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Feather Color: " + featherColor);
    }
}