package polymorphism.overriding;

public class PolyMainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSount();

        Dog dog = new Dog();
        dog.makeSount();

        Animal animalDog = new Dog();
        animalDog.makeSount();
    }
}
