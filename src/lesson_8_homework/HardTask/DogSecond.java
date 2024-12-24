package lesson_8_homework.HardTask;

public class DogSecond {
    private String name;


    private DogSecond(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Woof! My name is " + name);
    }

    public void eat(String food) {
        System.out.println("The Dog eats " + food);
    }

    //Make Factory
    public static class DogFactory {
        public static DogSecond createDog(String name) {
            return new DogSecond(name);
        }
    }
}
