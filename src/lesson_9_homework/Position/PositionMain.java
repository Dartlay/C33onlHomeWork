package lesson_9_homework.Position;
public class PositionMain {
    public static void main(String[] args) {
        getPosition();
    }

    public static void getPosition() {
        Position director = new Director();
        Position worker = new Worker();
        Position accountant = new Accountant();

        System.out.println();
        director.printPosition();
        System.out.println();
        worker.printPosition();
        System.out.println();
        accountant.printPosition();
    }
}
