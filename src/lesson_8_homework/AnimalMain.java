package lesson_8_homework;

public class AnimalMain {
    public static void main(String[] args) {
        Animal tiger = new Tigger();
        Animal rabbit = new Rabbit();
       Animal dog = new Dog();

       dog.voice();
       dog.eat("Bone");
       dog.eat("Grass");
        System.out.println("-------------------");

        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
        System.out.println("-------------------");


        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");
        System.out.println("-------------------");

    }
}
