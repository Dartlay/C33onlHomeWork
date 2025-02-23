package lesson_18_homework.Task2;

import java.util.Arrays;

public class SortingManager {
    public void runSorting() {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] arrayForInsertion = Arrays.copyOf(array, array.length);
        int[] arrayForSelection = Arrays.copyOf(array, array.length);
        int[] arrayForBubble = Arrays.copyOf(array, array.length);

        Thread insertionThread = new Thread(new InsertionSort(arrayForInsertion));
        Thread selectionThread = new Thread(new SelectionSort(arrayForSelection));
        Thread bubbleThread = new Thread(new BubbleSort(arrayForBubble));

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();


        try {
            insertionThread.join();
            selectionThread.join();
            bubbleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}