package lesson_8_homework;

class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("The rabbit makes the sound, Honking");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println("The rabbit likes to eat grass");
        } else {
            System.out.println("The rabbit's not happy, he won't eat " + food + "!");
        }
    }
}