package lesson_8_homework.HardTask;

class Dog {
    private String name;


    private Dog(String name) {
        this.name = name;
    }


    public static Dog createDog(String name) {
        return new Dog(name);
    }

    public void voice() {
        System.out.println("Woof! My name is " + name);
    }

    public void eat(String food) {
        System.out.println("The Dog eats " + food);
    }
}