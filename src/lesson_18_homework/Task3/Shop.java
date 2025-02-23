package lesson_18_homework.Task3;

public class Shop {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    //
    private int productCount = 0;
    private final int maxProducts = 3;

    public synchronized void produce() {
        while (productCount >= maxProducts) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productCount++;
        System.out.println(ANSI_YELLOW + "Производитель добавил товар."
                + ANSI_RESET + " Товаров в магазине: " + ANSI_GREEN + productCount + ANSI_RESET);
        notify();
    }
    public synchronized void consume() {
        while (productCount <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productCount--;
        System.out.println(ANSI_GREEN +"Покупатель купил товар. Товаров в магазине: "
                + ANSI_GREEN + productCount + ANSI_RESET);
        notify();
    }
}

