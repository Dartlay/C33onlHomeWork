package lesson_18_homework.Task2;

public class SelectionSort implements Runnable{
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }
    @Override
    public void run() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Сортировка выбором: " + arrayToString());
    }
    private String arrayToString() {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}

