package SESSION09.BAI04;

public class BAI04 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
//        animal.wagTail();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
    }
}
