// Animal.java OOP-KRSY-NDARU-102022340086

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println("Animal makes a sound.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void animalInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}
