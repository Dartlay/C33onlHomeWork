package lesson_18_homework.Task1;

public class MinMaxProcessor {
    public void process() {
        InputHandler inputHandler = new InputHandler();
        int[] array = inputHandler.getInputArray();

        MinMaxFinder finder = new MinMaxFinder(array);

        Thread maxThread = new Thread(finder::findMax);
        Thread minThread = new Thread(finder::findMin);

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Максимальное значение: " + finder.getMax());
        System.out.println("Минимальное значение: " + finder.getMin());
    }
}
