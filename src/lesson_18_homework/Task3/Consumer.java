package lesson_18_homework.Task3;

public class Consumer implements Runnable{
    private Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            shop.consume();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
