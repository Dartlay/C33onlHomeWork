package lesson_8_homework.HardTask;

public class HardTaskMain {
    public static void main(String[] args) {
        // Create an object via static method
        firstMethod();
        System.out.println("-----------------------------------");
        secondMethod();
    }
    static void firstMethod (){

        Dog dog = Dog.createDog("Rorschach");
        dog.voice();
        dog.eat("Meat");
    }
    static void secondMethod(){
        // Create an object through an internal class
        DogSecond dogSecond = DogSecond.DogFactory.createDog("Manhattan");
        dogSecond.voice();
        dogSecond.eat("Bone");
    }
}
