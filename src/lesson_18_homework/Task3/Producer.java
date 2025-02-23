package lesson_18_homework.Task3;

public class Producer implements Runnable{
    private Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            shop.produce();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}