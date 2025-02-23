package lesson_18_homework.Task1;

public class MinMaxFinder {
    private int[] array;
    private int max;
    private int min;

    public MinMaxFinder(int[] array) {
        this.array = array;
        this.max = Integer.MIN_VALUE;
        this.min = Integer.MAX_VALUE;
    }

    public void findMax() {
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
    }
    public void findMin() {
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
    }
    public int getMax() {
        return max;
    }
    public int getMin() {
        return min;
    }
}