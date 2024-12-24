package lesson_8_homework;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("The Dogs barks");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Bone")) {
            System.out.println("A doggie would love to chew on a bone.");
        } else {
            System.out.println("The dog won't eat " + food + "!");
        }
    }
}
