package lesson_14_homework.Task2;

import java.util.ArrayList;

public class AnimalCollection {
    private ArrayList<String> animals;

    public AnimalCollection() {
        animals = new ArrayList<>();
    }


    public void addAnimal(String animal) {
        animals.add(0, animal);
    }


    public String removeAnimal() {
        if (animals.isEmpty()) {
            return null;
        }
        return animals.remove(animals.size() - 1);
    }


    public void displayAnimals() {
        System.out.println("Животные в коллекции: " + animals);
    }
}

