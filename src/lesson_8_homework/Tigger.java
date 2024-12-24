package lesson_8_homework;

class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("The tiger Roars!");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Tiger enjoys eating meat");
        } else {
            System.out.println("The tiger doesn't eat " + food + "!");
        }
    }
}