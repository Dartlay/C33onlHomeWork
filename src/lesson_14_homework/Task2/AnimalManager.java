package lesson_14_homework.Task2;

public class AnimalManager {
    private AnimalCollection animalCollection;

    public AnimalManager() {
        animalCollection = new AnimalCollection();
    }

    public void manageAnimals() {

        animalCollection.addAnimal("Слон");
        animalCollection.addAnimal("Тигр");
        animalCollection.addAnimal("Медведь");

        animalCollection.displayAnimals();

        System.out.println("Удалено: " + animalCollection.removeAnimal());
        animalCollection.displayAnimals();

        System.out.println("Удалено: " + animalCollection.removeAnimal());
        animalCollection.displayAnimals();

        System.out.println("Удалено: " + animalCollection.removeAnimal());
        animalCollection.displayAnimals();
    }
}